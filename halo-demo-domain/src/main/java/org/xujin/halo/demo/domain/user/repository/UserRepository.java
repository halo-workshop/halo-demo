package org.xujin.halo.demo.domain.user.repository;

import org.xujin.halo.demo.domain.user.ports.UserPort;
import org.xujin.halo.demo.domain.user.entity.UserE;
import org.xujin.halo.annotation.domain.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * @author halo codegen
 * for demo
 **/
@DomainRepository
public class UserRepository {


    @Autowired
    private UserPort userPort;

    public Long addUser(UserE userE) {

        return 1L;
    }

}
