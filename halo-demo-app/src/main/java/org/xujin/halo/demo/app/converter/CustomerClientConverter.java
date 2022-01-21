package org.xujin.halo.demo.app.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xujin.halo.convertor.ConverterI;
import org.xujin.halo.demo.app.command.cmo.AddCustomerCmd;
import org.xujin.halo.demo.domain.customer.entity.CustomerE;
import org.xujin.halo.demo.domain.customer.factory.CustomerFactory;

/**
 * @author halo codegen
 * for demo
 **/
@Component
public class CustomerClientConverter implements ConverterI {

    @Autowired
    private CustomerFactory customerFactory;

    public CustomerE clientToEntity(AddCustomerCmd cmd) {
        CustomerE customerE=customerFactory.create();
        customerE.setName(cmd.getName());
        return customerE;
    }

}
