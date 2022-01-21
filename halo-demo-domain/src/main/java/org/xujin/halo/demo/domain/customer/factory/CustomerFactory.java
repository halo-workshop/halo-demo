package org.xujin.halo.demo.domain.customer.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.xujin.halo.annotation.domain.Factory;
import org.xujin.halo.demo.domain.customer.entity.CustomerE;
import org.xujin.halo.demo.domain.customer.repository.CustomerRepository;

@Factory
public class CustomerFactory {

    @Autowired
    CustomerRepository customerRepository;

    public CustomerE create(){
        CustomerE appE = new CustomerE();
        appE.setCustomerRepository(customerRepository);
        return appE;
    }

}