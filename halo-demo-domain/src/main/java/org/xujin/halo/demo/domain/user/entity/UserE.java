package org.xujin.halo.demo.domain.user.entity;

import org.xujin.halo.demo.domain.user.repository.UserRepository;
import org.xujin.halo.annotation.domain.Entity;

import lombok.Data;

/**
 * @author halo codegen
 * for demo
 **/
@Entity
@Data
public class UserE {

    private UserRepository userRepository;

    private Long id;

    private String name;

    private String role;

}
