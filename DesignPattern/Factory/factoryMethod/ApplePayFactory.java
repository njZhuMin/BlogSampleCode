package example.factoryMethod;

import example.simpleFactory.ApplePay;
import example.simpleFactory.IMerchant;

public class ApplePayFactory implements IMerchantFactory {
    @Override
    public IMerchant createMerchant() {
        return new ApplePay();
    }
}