package org.xujin.halo.demo.start.controller;

import org.xujin.halo.command.CommandBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.xujin.halo.demo.app.command.cmo.AddCustomerCmd;
import org.xujin.halo.dto.ResultData;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

   @Autowired
   private CommandBus commandBus;

   @PostMapping("/add")
   public ResultData<String> addCustomer(@RequestBody AddCustomerCmd addCustomerCmd){
      return commandBus.send(addCustomerCmd);
   }

}
