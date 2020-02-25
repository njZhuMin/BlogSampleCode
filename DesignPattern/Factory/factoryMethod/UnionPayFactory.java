package example.factoryMethod;

import example.simpleFactory.IMerchant;
import example.simpleFactory.UnionPay;

public class UnionPayFactory implements IMerchantFactory {
    @Override
    public IMerchant createMerchant() {
        return new UnionPay();
    }
}