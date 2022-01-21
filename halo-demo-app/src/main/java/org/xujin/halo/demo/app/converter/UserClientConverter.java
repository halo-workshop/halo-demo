package org.xujin.halo.demo.app.converter;

import org.xujin.halo.demo.app.command.cmo.AddUserCmd;
import org.xujin.halo.demo.domain.user.entity.UserE;
import org.xujin.halo.demo.domain.user.factory.UserFactory;
import org.xujin.halo.convertor.ConverterI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author halo codegen
 * for demo
 **/
@Component
public class UserClientConverter implements ConverterI {

    @Autowired
    private UserFactory userFactory;

    public UserE clientToEntity(AddUserCmd cmd) {
        UserE userE = userFactory.createUserE();
        userE.setName(cmd.getUserName());
        userE.setRole(cmd.getUserRole());
        return userE;
    }

}
