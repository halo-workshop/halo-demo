package org.xujin.halo.demo.app.command.cmo;

import org.xujin.halo.dto.Command;
import lombok.Data;

/**
 * @author halo codegen
 * for demo
 **/
@Data
public class AddUserCmd extends Command {
    private String userName;
    private String userRole;
}
