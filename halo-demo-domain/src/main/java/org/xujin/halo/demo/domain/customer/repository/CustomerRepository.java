package org.xujin.halo.demo.domain.customer.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.xujin.halo.annotation.domain.DomainRepository;
import org.xujin.halo.demo.domain.customer.entity.CustomerE;
import org.xujin.halo.demo.domain.customer.ports.CustomerPort;

@DomainRepository
public class CustomerRepository {

    @Autowired
    CustomerPort customerPort;

    public void save(CustomerE customerE){
        customerPort.addCustomer(customerE);
    }

}