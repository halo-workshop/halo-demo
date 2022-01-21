package org.xujin.halo.demo.app.ext;

import org.xujin.halo.annotation.extension.ExtensionPoint;
import org.xujin.halo.extension.ExtensionPointI;

@ExtensionPoint(name = "支付扩展",  desc = "支付扩展")
public interface PayExtPt extends ExtensionPointI {

    boolean pay();

}
