package com.bee.team.fastgo.vo.project.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "insertBackProjectVo",description = "新增后台项目vo")
public class InsertBackProjectVo implements Serializable {

    @ApiModelProperty(value = "项目名称", example = "testProject")
    @NotBlank(message = "项目名称不能为空")
    private String projectName;

    @ApiModelProperty(value = "项目描述", example = "测试项目")
    @NotBlank(message = "项目描述不能为空")
    private String projectDesc;

    @ApiModelProperty(value = "项目包名", example = "com.xx.xx")
    private String packageName;

    @ApiModelProperty(value = "项目git地址", example = "172.22.5.222/gitlab")
    private String gitUrl;

    @ApiModelProperty(value = "运行服务器ip", example = "127.0.0.1")
    private String runServerIp;

    @ApiModelProperty(value = "项目环境名称", example = "测试环境")
    @NotBlank(message = "项目环境名称不能为空")
    private String profileName;

    @ApiModelProperty(value = "运行环境元配置",example = "xxx")
    private String runProfileConfig;

    @ApiModelProperty(value = "运行环境code", example = "测试项目")
    private String runProfileCode;

    @ApiModelProperty(value = "软件环境list", example = "xxx")
    private List<SoftwareInfoVo> softwareInfoVos;

}
