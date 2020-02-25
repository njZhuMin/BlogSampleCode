package example.factoryMethod;

import example.simpleFactory.IMerchant;

public class Client {
    public static void main(String[] args) {
        IMerchantFactory merchantFactory = new AliPayFactory();
        IMerchant merchant = merchantFactory.createMerchant();
        merchant.payBill();
    }
}
