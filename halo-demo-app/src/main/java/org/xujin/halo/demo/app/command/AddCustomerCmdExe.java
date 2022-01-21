package org.xujin.halo.demo.app.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.xujin.halo.annotation.command.CmdHandler;
import org.xujin.halo.command.CommandExecutorI;
import org.xujin.halo.demo.app.command.cmo.AddCustomerCmd;
import org.xujin.halo.demo.app.converter.CustomerClientConverter;
import org.xujin.halo.demo.domain.customer.entity.CustomerE;
import org.xujin.halo.dto.ResultData;

@CmdHandler
public class AddCustomerCmdExe implements CommandExecutorI<ResultData<String>, AddCustomerCmd> {

    @Autowired
    private CustomerClientConverter customerClientConverter;

    @Override
    public ResultData<String> execute(AddCustomerCmd cmd) {
        //1.做一些check，此处省略
        CustomerE customerE = customerClientConverter.clientToEntity(cmd);
        customerE.save();
        return ResultData.success("success");
    }

}