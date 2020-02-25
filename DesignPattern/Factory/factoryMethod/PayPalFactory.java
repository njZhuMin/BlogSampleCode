package example.factoryMethod;

import example.simpleFactory.IMerchant;
import example.simpleFactory.PayPal;

public class PayPalFactory implements IMerchantFactory {
    @Override
    public IMerchant createMerchant() {
        return new PayPal();
    }
}