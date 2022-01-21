package org.xujin.halo.demo.start.controller;

import org.xujin.halo.demo.app.command.cmo.AddUserCmd;
import org.xujin.halo.command.CommandBus;
import org.xujin.halo.dto.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author halo codegen
 * for demo
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private CommandBus commandBus;

    @PostMapping("/add")
    public ResultData<Long> addUser(@RequestBody AddUserCmd addUserCmd) {
        return commandBus.send(addUserCmd);
    }

}
