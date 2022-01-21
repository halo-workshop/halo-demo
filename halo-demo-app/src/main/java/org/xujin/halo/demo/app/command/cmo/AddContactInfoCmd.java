package org.xujin.halo.demo.app.command.cmo;

import lombok.Data;
import org.xujin.halo.dto.Command;

@Data
public class AddContactInfoCmd extends Command {

    private String street;
    private String city;
    private String state;

}


