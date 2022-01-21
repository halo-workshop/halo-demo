package org.xujin.halo.demo.domain.customer.ports;

import org.xujin.halo.annotation.domain.Port;
import org.xujin.halo.demo.domain.customer.entity.CustomerE;


/**
 * @author halo codegen
 * for demo
 **/
@Port
public interface CustomerPort {

    public void addCustomer(CustomerE customerE);

}