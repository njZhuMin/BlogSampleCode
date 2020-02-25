package example.factoryMethod;

import example.simpleFactory.IMerchant;
import example.simpleFactory.WechatPay;

public class WechatPayFactory implements IMerchantFactory {
    @Override
    public IMerchant createMerchant() {
        return new WechatPay();
    }
}