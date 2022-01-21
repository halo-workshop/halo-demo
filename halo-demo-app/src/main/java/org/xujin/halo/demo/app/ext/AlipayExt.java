package org.xujin.halo.demo.app.ext;

import org.xujin.halo.annotation.extension.Extension;

@Extension(name = "支付宝支付", bizCode = "yz.pay.alipay",desc = "支付宝扩展")
public class AlipayExt implements PayExtPt {

    @Override
    public boolean pay() {
        return false;
    }
}
