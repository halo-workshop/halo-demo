package org.xujin.halo.demo.infrastructure.adapters;

import org.springframework.beans.factory.annotation.Autowired;
import org.xujin.halo.annotation.infrastructure.Adapter;
import org.xujin.halo.demo.domain.customer.entity.CustomerE;
import org.xujin.halo.demo.domain.customer.ports.CustomerPort;
import org.xujin.halo.demo.infrastructure.tunnel.db.dao.CustomerMapper;
import org.xujin.halo.demo.infrastructure.tunnel.db.dataobject.CustomerDO;
import org.xujin.halo.utils.reflect.BeanMapper;

@Adapter
public class CustomerAdapter implements CustomerPort {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void addCustomer(CustomerE customerE) {
        CustomerDO customerDO=BeanMapper.map(customerE, CustomerDO.class);
        customerMapper.insert(customerDO);
    }
}
