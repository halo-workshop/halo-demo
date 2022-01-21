package org.xujin.halo.demo.start.controller;

import org.xujin.halo.command.CommandBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.xujin.halo.demo.app.command.TestFlowCmdExe;
import org.xujin.halo.dto.ResultData;

@RestController
@RequestMapping("/flow")
public class TestFlowController {

   @Autowired
   private CommandBus commandBus;

   @GetMapping("/test")
   public ResultData testFlow(){
      return commandBus.send(TestFlowCmdExe.class);

   }

}
