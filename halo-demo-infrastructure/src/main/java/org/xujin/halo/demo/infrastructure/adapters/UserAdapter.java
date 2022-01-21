package org.xujin.halo.demo.infrastructure.adapters;

import org.xujin.halo.demo.domain.user.ports.UserPort;
import org.xujin.halo.demo.infrastructure.tunnel.db.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.xujin.halo.annotation.infrastructure.Adapter;

/**
* @author halo codegen
* for demo
**/
@Adapter
public class UserAdapter implements UserPort {

   @Override
   public void addUser() {

   }
}