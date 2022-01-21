package org.xujin.halo.demo.domain.customer.valueobject;

import lombok.Getter;
import lombok.Setter;
import org.xujin.halo.annotation.domain.ValueObject;

@ValueObject
@Setter
@Getter
public class ContactInfoVO {


    private String homePhoneNumber;

    private String workPhoneNumber;

    private String faxNumber;

    private String emailAddress;





}