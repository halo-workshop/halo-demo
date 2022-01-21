package org.xujin.halo.demo.domain.customer.entity;

import lombok.Data;
import org.xujin.halo.annotation.domain.AggregateRoot;
import org.xujin.halo.annotation.domain.DomainAbility;
import org.xujin.halo.annotation.domain.Entity;
import org.xujin.halo.annotation.domain.UniqueIdentity;
import org.xujin.halo.demo.domain.customer.repository.CustomerRepository;

@Entity
@AggregateRoot
@Data
public class CustomerE {

    @UniqueIdentity
    private Long customerId;

    private CustomerRepository customerRepository;

    private String name;

    @DomainAbility
    public void save(){
        customerRepository.save(this);
    }

}