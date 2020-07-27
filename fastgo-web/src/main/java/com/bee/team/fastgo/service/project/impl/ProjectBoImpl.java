package com.bee.team.fastgo.service.project.impl;

import com.alibaba.lava.base.AbstractLavaBoImpl;
import com.bee.team.fastgo.constant.ProjectConstant;
import com.bee.team.fastgo.context.ProjectEvent;
import com.bee.team.fastgo.context.ProjectPublisher;
import com.bee.team.fastgo.dao.ProjectDao;
import com.bee.team.fastgo.mapper.*;
import com.bee.team.fastgo.model.*;
import com.bee.team.fastgo.project.gitlab.GitlabAPI;
import com.bee.team.fastgo.project.model.GitlabProjectDo;
import com.bee.team.fastgo.service.project.ProjectBo;
import com.bee.team.fastgo.vo.project.*;
import com.bee.team.fastgo.vo.project.req.*;
import com.spring.simple.development.core.component.mvc.BaseSupport;
import com.spring.simple.development.core.component.mvc.page.ResPageDTO;
import com.spring.simple.development.core.component.mvc.utils.Pager;
import com.spring.simple.development.support.exception.GlobalException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.bee.team.fastgo.constant.ProjectConstant.*;
import static com.spring.simple.development.support.exception.ResponseCode.*;


@Service
public class ProjectBoImpl extends AbstractLavaBoImpl<ProjectDo, ProjectDoMapperExt, ProjectDoExample> implements ProjectBo {

    @Autowired
    public void setBaseMapper(ProjectDoMapperExt mapper) {
        setMapper(mapper);
    }

    @Autowired
    private BaseSupport baseSupport;

    @Autowired
    private ProjectDao projectDao;

    @Autowired
    private ProjectPublisher projectPublisher;

    @Override
    public ResPageDTO<ProjectListVo> queryBackProjectInfo(QueryProjectListVo queryProjectListVo) {
        Pager<ProjectListVo> pager = new Pager<>();
        pager.setPageNo(queryProjectListVo.getPageNum());
        pager.setLimit(queryProjectListVo.getPageSize());
        Map<String,Object> map = new HashMap<>();
        map.put("start",pager.getStart());
        map.put("limit",pager.getLimit());
        List<ProjectListVo> projectListVoList = mapper.findBackPorjectList(map);
        pager.setData(projectListVoList);
        return baseSupport.pagerCopy(pager,ProjectListVo.class);
    }

    @Override
    public void addBackProjectInfo(InsertBackProjectVo insertBackProjectVo) {
        //项目基本信息
        ProjectDo projectDo = baseSupport.objectCopy(insertBackProjectVo,ProjectDo.class);
        //定义项目code(项目名大写)
        String projectCode = insertBackProjectVo.getProjectName().toUpperCase();
        projectDo.setProjectCode(projectCode);
        projectDo.setProjectType(ProjectConstant.PROJECT_TYPE2.toString());
        projectDo.setProjectStatus(PROJECT_STATUS1.toString());

        //配置环境
        InsertBackProjectProfileVo insertBackProjectProfileVo = baseSupport.objectCopy(insertBackProjectVo,InsertBackProjectProfileVo.class);
        insertBackProjectProfileVo.setProjectCode(projectCode);
        Integer flag = projectDao.addProjectProfile(insertBackProjectProfileVo);
        projectDo.setProjectStatus(flag.toString());

        //生成后台项目模板
        if (StringUtils.isEmpty(insertBackProjectVo.getGitUrl())){
           String filePath = projectDao.generateSimpleTemplate(projectDo);
           if (!StringUtils.isEmpty(filePath)){
               System.out.println(filePath);
           }else {
               throw new GlobalException(RES_DATA_NOT_EXIST,"自动生成代码框架失败");
           }
           //创建新的gitlab后台项目
            GitlabProjectDo gitlabProjectDo = new GitlabProjectDo();
            try {
                GitlabAPI gitlabAPI = new GitlabAPI("http://172.22.5.242",null,null,null);
                gitlabProjectDo = gitlabAPI.createNewProject(insertBackProjectVo.getProjectName(),insertBackProjectVo.getProjectDesc());
                if (ObjectUtils.isEmpty(gitlabProjectDo)){
                    throw new GlobalException(RES_ILLEGAL_OPERATION,"gitlab项目创建失败");
                }
            }catch (Exception e){
                throw new GlobalException(RES_ILLEGAL_OPERATION,"gitlab项目创建失败");
            }
            //上传后台模板代码到gitlab项目中
            projectDao.uploadBackCodeIntoGitlab(gitlabProjectDo,filePath);
            projectDo.setGitUrl(gitlabProjectDo.getHttpUrl());
        }
        mapper.insertSelective(projectDo);
        //事件添加webhook
        ProjectEvent projectEvent = new ProjectEvent(new Object(),projectCode,"http://www.baidu.com");
        projectPublisher.publish(projectEvent);
    }

    @Override
    public void addBackProjectProfile(InsertBackProjectProfileVo insertBackProjectProfileVo) {
        projectDao.addProjectProfile(insertBackProjectProfileVo);
    }

    @Override
    public String findProjectLog(QueryProjectLogVo queryProjectLogVo) {
        // TODO: 2020/7/24 查询项目日志
        return null;
    }

    @Override
    public ResPageDTO<ProjectListVo> queryFrontProjectInfo(QueryProjectListVo queryProjectListVo) {
        Pager<ProjectListVo> pager = new Pager<>();
        pager.setPageNo(queryProjectListVo.getPageNum());
        pager.setLimit(queryProjectListVo.getPageSize());
        Map<String,Object> map = new HashMap<>();
        map.put("start",pager.getStart());
        map.put("limit",pager.getLimit());
        List<ProjectListVo> projectListVoList = mapper.findFrontPorjectList(map);
        pager.setData(projectListVoList);
        return baseSupport.pagerCopy(pager,ProjectListVo.class);
    }

    @Override
    public void addFrontProjectInfo(InsertFrontProjectVo insertFrontProjectVo) {
        //项目基本信息
        ProjectDo projectDo = baseSupport.objectCopy(insertFrontProjectVo,ProjectDo.class);
        //定义项目code(项目名大写)
        String projectCode = insertFrontProjectVo.getProjectName().toUpperCase();
        projectDo.setProjectCode(projectCode);
        projectDo.setProjectType(ProjectConstant.PROJECT_TYPE2.toString());
        projectDo.setProjectStatus(PROJECT_STATUS1.toString());

        //配置环境
        InsertBackProjectProfileVo insertBackProjectProfileVo = baseSupport.objectCopy(insertFrontProjectVo,InsertBackProjectProfileVo.class);
        Integer flag = projectDao.addProjectProfile(insertBackProjectProfileVo);
        projectDo.setProjectStatus(flag.toString());

        //生成前台项目模板
        if (StringUtils.isEmpty(insertFrontProjectVo.getGitUrl())){
            //创建新的gitlab后台项目
            GitlabProjectDo gitlabProjectDo = new GitlabProjectDo();
            try {
                GitlabAPI gitlabAPI = new GitlabAPI("http://172.22.5.242",null,null,null);
                gitlabProjectDo = gitlabAPI.createNewProject(insertFrontProjectVo.getProjectName(),insertFrontProjectVo.getProjectDesc());
                if (ObjectUtils.isEmpty(gitlabProjectDo)){
                    throw new GlobalException(RES_ILLEGAL_OPERATION,"gitlab项目创建失败");
                }
            }catch (Exception e){
                throw new GlobalException(RES_ILLEGAL_OPERATION,"gitlab项目创建失败");
            }
            //上传后台模板代码到gitlab项目中
            if (1 == insertFrontProjectVo.getProjectType()){
                projectDao.uploadFrontCodeIntoGitlab(gitlabProjectDo, FRONT_PROJECT_TYPE1);
            }else if ( 2 == insertFrontProjectVo.getProjectType() ){
                projectDao.uploadFrontCodeIntoGitlab(gitlabProjectDo, FRONT_PROJECT_TYPE2);
            }

            projectDo.setGitUrl(gitlabProjectDo.getHttpUrl());
        }
        mapper.insertSelective(projectDo);
    }

    @Override
    public String execDeployBackProject(DeployBackPorjectVo deployBackPorjectVo) {
        // TODO: 2020/7/24 调取服务器部署项目脚本
        return "";
    }

    /**
     * @param updateProjectStatusVo
     * @return
     * @author hs
     * @date 2020/7/25
     * @desc TODO
     */
    @Override
    public void updateProjectStatus(UpdateProjectStatusVo updateProjectStatusVo) {
        Map<String,Object> map = new HashMap<>();
        map.put("code",updateProjectStatusVo.getCode());
        map.put("type",updateProjectStatusVo.getType());
        ProjectDo projectDo = mapper.queryProjectInfo(map);
        if (!ObjectUtils.isEmpty(projectDo)){
            throw new GlobalException(RES_DATA_NOT_EXIST,"未找到对应的项目信息");
        }
        if (OBJECT_TYPE1.equals(updateProjectStatusVo.getType())){
            //运行环境
            if (PROJECT_STATUS1.equals(updateProjectStatusVo.getType())){
                projectDo.setProjectStatus(PROJECT_STATUS6.toString());
            }else if (PROJECT_STATUS5.equals(updateProjectStatusVo.getType())){
                projectDo.setProjectStatus(PROJECT_STATUS2.toString());
            }
        }else if (OBJECT_TYPE2.equals(updateProjectStatusVo.getType())){
            //软件环境
            if (PROJECT_STATUS1.equals(updateProjectStatusVo.getType())){
                projectDo.setProjectStatus(PROJECT_STATUS5.toString());
            }else if (PROJECT_STATUS6.equals(updateProjectStatusVo.getType())){
                projectDo.setProjectStatus(PROJECT_STATUS2.toString());
            }
        }
        mapper.updateByPrimaryKeySelective(projectDo);
    }


}