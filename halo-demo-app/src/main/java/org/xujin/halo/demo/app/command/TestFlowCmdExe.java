package org.xujin.halo.demo.app.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.xujin.halo.annotation.command.CmdHandler;
import org.xujin.halo.command.CommandExecutorWithoutInputI;

import org.xujin.halo.dto.ResultData;
import org.xujin.halo.flow.FlowEngine;

@CmdHandler
public class TestFlowCmdExe implements CommandExecutorWithoutInputI<ResultData<String>> {

    @Autowired
    private FlowEngine flowEngine;

    @Override
    public ResultData<String> execute() {
        flowEngine.start("demoFlow","张三");
        return ResultData.success("sucess") ;

    }

}
