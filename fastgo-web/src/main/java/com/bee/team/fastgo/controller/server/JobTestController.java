package com.bee.team.fastgo.controller.server;

import com.bee.team.fastgo.hander.JobHandler;
import com.bee.team.fastgo.hander.JobPushImpl;
import com.bee.team.fastgo.hander.SimpleExecutorCmd;
import com.bee.team.fastgo.job.core.glue.GlueTypeEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author luke
 * @date 17/5/10
 */
@Controller
@RequestMapping("/api")
public class JobTestController {



    /**
     * api
     *
     * @param data
     * @return
     */
    @RequestMapping("/test")
    @ResponseBody
    public String test(HttpServletRequest request, @RequestBody(required = false) String data) {
        String cmd = request.getParameter("cmd");
        String ip = request.getParameter("ip");
        String logId = SimpleExecutorCmd.executorCmd(GlueTypeEnum.GLUE_SHELL, cmd, null, -1, ip);
        JobHandler.jobMap.put(logId,new JobPushImpl());
        return logId;
    }

}
