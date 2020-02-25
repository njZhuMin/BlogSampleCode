package example.factoryMethod;

import example.simpleFactory.AliPay;
import example.simpleFactory.IMerchant;

public class AliPayFactory implements IMerchantFactory {
    @Override
    public IMerchant createMerchant() {
        return new AliPay();
    }
}
