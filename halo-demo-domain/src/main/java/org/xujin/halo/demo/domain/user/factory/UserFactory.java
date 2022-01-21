package org.xujin.halo.demo.domain.user.factory;

import org.xujin.halo.demo.domain.user.entity.UserE;
import org.xujin.halo.demo.domain.user.repository.UserRepository;
import org.xujin.halo.annotation.domain.Factory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author halo codegen
 * for demo
 **/
@Factory
public class UserFactory {

    @Autowired
    private UserRepository userRepository;

    public UserE createUserE() {
        UserE userE = new UserE();
        userE.setUserRepository(userRepository);
        return userE;
    }

}
