package org.xujin.halo.demo.app.appservice;

import org.xujin.halo.command.BaseAppService;

import org.xujin.halo.annotation.app.AppService;

@AppService
public class UploadFileAS implements BaseAppService<String,String> {

   @Override
   public String  execute(String input) {
    return null;

   }

}


