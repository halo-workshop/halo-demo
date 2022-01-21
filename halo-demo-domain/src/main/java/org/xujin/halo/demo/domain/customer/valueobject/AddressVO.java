package org.xujin.halo.demo.domain.customer.valueobject;

import org.xujin.halo.annotation.domain.AggregatePart;
import org.xujin.halo.annotation.domain.ValueObject;
import org.xujin.halo.demo.domain.customer.entity.CustomerE;

@ValueObject
@AggregatePart(root= CustomerE.class)
public class AddressVO {

    private String street;
    private String city;
    private String state;

}