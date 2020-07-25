package com.bee.team.fastgo.dao;

import com.bee.team.fastgo.model.ProjectDo;
import com.bee.team.fastgo.project.model.GitlabProjectDo;

public interface ProjectDao {

    /**
     * 生成simple框架模板
     * @return
     */
    String generateSimpleTemplate(ProjectDo projectDo);

    /**
     * 上传后台模板代码到gitlab项目中
     * @param gitlabProjectDo
     * @param filePath
     * @return
     */
    void uploadCodeIntoGitlab(GitlabProjectDo gitlabProjectDo,String filePath);

}
