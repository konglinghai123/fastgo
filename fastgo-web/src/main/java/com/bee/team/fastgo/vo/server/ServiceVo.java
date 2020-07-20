package com.bee.team.fastgo.vo.server;

import lombok.Data;

/**
 * @author liko
 * @description MyBatis Generator 自动创建,对应数据表为：t_server
 * @date 2020/07/20
 */
@Data
public class ServiceVo {
    /**
     * id
     */
    private Long id;
    /**
     * 服务器名称
     */
    private String serverName;

    /**
     * 服务器IP
     */
    private String serverIp;

    /**
     * ssh端口
     */
    private Integer sshPort;

    /**
     * ssh用户
     */
    private String sshUser;

    /**
     * ssh密码
     */
    private String sshPassword;

    /**
     * 1:未连接
     * 2:已连接
     */
    private String serverStatus;

    /**
     * 1:手动注册
     * 2:自动注册
     */
    private String type;

    /**
     * 服务调用token
     */
    private String serviceToken;
}