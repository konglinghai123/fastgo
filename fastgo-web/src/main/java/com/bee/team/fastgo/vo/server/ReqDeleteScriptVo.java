package com.bee.team.fastgo.vo.server;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author jgz
 * @version 1.0
 * @date 2020/7/24 18:47
 * @ClassName ReqDeleteScriptVo
 * @Description 删除脚本信息对象
 **/
@Data
@ApiModel(value = "ReqDeleteScriptVo", description = "删除脚本信息对象")
public class ReqDeleteScriptVo {

    @ApiModelProperty(value = "脚本key", example = "ssafadfa", required = true)
    @NotNull(message = "脚本key不能为空")
    private String scriptKey;

}
