package org.xujin.halo.demo.app.command;

import org.xujin.halo.annotation.command.CmdHandler;
import org.xujin.halo.demo.app.command.cmo.AddUserCmd;
import org.xujin.halo.demo.app.converter.UserClientConverter;
import org.xujin.halo.demo.domain.user.entity.UserE;
import org.xujin.halo.demo.domain.user.service.UserService;
import org.xujin.halo.command.CommandExecutorI;
import org.xujin.halo.dto.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author halo codegen
 * for demo
 **/
@CmdHandler
public class AddUserCmdExe implements CommandExecutorI<ResultData<Long>, AddUserCmd> {

    @Autowired
    private UserService userService;

    @Autowired
    private UserClientConverter userClientConverter;

    @Override
    public ResultData<Long> execute(AddUserCmd addUserCmd) {
        UserE userE = userClientConverter.clientToEntity(addUserCmd);
        try {
            Long userId = userService.addUser(userE);
            return ResultData.success(userId);
        } catch (Exception ex) {
            return ResultData.fail("add user failed");
        }
    }

}
