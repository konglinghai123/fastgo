package com.bee.team.fastgo.service.api.server.impl;

import com.bee.team.fastgo.common.ScriptTypeConstant;
import com.bee.team.fastgo.common.SoftwareEnum;
import com.bee.team.fastgo.exception.sever.ScriptException;
import com.bee.team.fastgo.model.ServerSoftwareProfileDo;
import com.bee.team.fastgo.service.api.dto.server.req.ReqCreateSoftwareDTO;
import com.bee.team.fastgo.service.api.dto.server.req.ReqExecScriptDTO;
import com.bee.team.fastgo.service.api.dto.server.res.ResCreateSoftwareDTO;
import com.bee.team.fastgo.service.api.server.ScriptApi;
import com.bee.team.fastgo.service.api.server.SoftwareProfileApi;
import com.bee.team.fastgo.service.server.ServerSoftwareProfileBo;
import com.spring.simple.development.core.component.mvc.BaseSupport;
import com.spring.simple.development.support.constant.CommonConstant;
import com.spring.simple.development.support.exception.GlobalException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @author jgz
 * @date 2020/7/25
 * @desc 软件环境api实现
 **/
@Service
public class SoftwareProfileApiImpl implements SoftwareProfileApi {

    @Autowired
    private BaseSupport baseSupport;

    @Autowired
    private ServerSoftwareProfileBo serverSoftwareProfileBo;

    @Autowired
    private ScriptApi scriptApi;

    @Override
    public ResCreateSoftwareDTO createSoftwareEnvironment(ReqCreateSoftwareDTO reqCreateSoftwareDTO) {
        checkParam(reqCreateSoftwareDTO);

        // 1.查询是否存在该配置?
        ServerSoftwareProfileDo ssp = serverSoftwareProfileBo.getServerSoftwareProfileByServerIpAndSoftwareNameAndVersion(reqCreateSoftwareDTO.getIp(),
                reqCreateSoftwareDTO.getSoftwareName(),
                reqCreateSoftwareDTO.getVersion());
        if(ssp != null){
            ResCreateSoftwareDTO resCreateSoftwareDTO = new ResCreateSoftwareDTO();
            resCreateSoftwareDTO.setConfigFlag(CommonConstant.CODE1);
            resCreateSoftwareDTO.setSoftwareConfig(ssp.getSoftwareConfig());
            return resCreateSoftwareDTO;
        }

        // TODO 2.该服务器是否处于托管中?

        // TODO 3.为该服务器安装软件,并拿到脚本执行的key
        ReqExecScriptDTO reqExecScriptDTO = baseSupport.objectCopy(reqCreateSoftwareDTO, ReqExecScriptDTO.class);
        // TODO 调用软件资源库获取下载地址
        reqExecScriptDTO.setType(ScriptTypeConstant.INSTALL);
        scriptApi.execScript(reqExecScriptDTO);

        // TODO 4.将该软件的信息保存到数据库

        // TODO 5.返回配置

        return null;
    }


    private void checkParam(ReqCreateSoftwareDTO reqCreateSoftwareDTO){
        if(StringUtils.isEmpty(reqCreateSoftwareDTO.getProjectCode())){
            throw new GlobalException(ScriptException.SCRIPT_ABNORMAL,"传入的项目code为空");
        }
        if(StringUtils.isEmpty(reqCreateSoftwareDTO.getIp())) {
            throw new GlobalException(ScriptException.SCRIPT_ABNORMAL,"服务器IP为空");
        }
        if(StringUtils.isEmpty(reqCreateSoftwareDTO.getSoftwareName())) {
            throw new GlobalException(ScriptException.SCRIPT_ABNORMAL,"软件名为空");
        }
        if(Stream.of(SoftwareEnum.values()).map(SoftwareEnum::name).map(String::toLowerCase).noneMatch(s -> s.equals(reqCreateSoftwareDTO.getSoftwareName()))) {
            throw new GlobalException(ScriptException.SCRIPT_ABNORMAL, "不支持的软件类型");
        }
        if(StringUtils.isEmpty(reqCreateSoftwareDTO.getVersion())) {
            throw new GlobalException(ScriptException.SCRIPT_ABNORMAL,"软件版本号为空");
        }
    }

}
