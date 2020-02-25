package example.abstractFactory;

import java.util.Calendar;

public class Client {
    public static void main(String[] args) {
        ForeignMerchantFactory foreignMerchantFactory = new ForeignMerchantFactory();
        foreignMerchantFactory.createPreparePayment().preparePaymentEnvironment();
        foreignMerchantFactory.createMerchant().payBill();

        ChinaMerchantFactory chinaMerchantFactory = new ChinaMerchantFactory();
        chinaMerchantFactory.createPreparePayment().preparePaymentEnvironment();
        chinaMerchantFactory.createMerchant().payBill();
    }
}
