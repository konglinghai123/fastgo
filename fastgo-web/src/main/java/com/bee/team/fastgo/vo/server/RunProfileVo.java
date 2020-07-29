package com.bee.team.fastgo.vo.server;

import com.spring.simple.development.core.component.mvc.page.ReqPageDTO;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author luke
 * @desc 查询运行环境
 * @date 2020-07-29
 **/
@Data
@ApiModel(value = "runProfileVo", description = "查询运行环境")
public class RunProfileVo extends ReqPageDTO {
    /**
     * 运行环境Ip
     */
    private String ip;
    /**
     * 运行环境端口
     */
    private Integer port;
}
