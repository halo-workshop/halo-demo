package org.xujin.halo.demo.domain.user.service.impl;

import org.xujin.halo.demo.domain.user.entity.UserE;
import org.xujin.halo.demo.domain.user.repository.UserRepository;
import org.xujin.halo.demo.domain.user.service.UserService;
import org.xujin.halo.annotation.domain.DomainService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author halo codegen
 * for dmeo
 **/
@DomainService
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Long addUser(UserE userE) {
        return userRepository.addUser(userE);
    }

}
