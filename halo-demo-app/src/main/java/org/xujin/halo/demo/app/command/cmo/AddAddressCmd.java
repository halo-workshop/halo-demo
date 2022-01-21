package org.xujin.halo.demo.app.command.cmo;

import lombok.Data;
import org.xujin.halo.dto.Command;

@Data
public class AddAddressCmd extends Command {

    private String homePhoneNumber;

    private String workPhoneNumber;

    private String faxNumber;

    private String emailAddress;

}
