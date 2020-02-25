package example.simpleFactory;

public class Client {
    public static void main(String[] args) {
        try {
            IMerchant merchant = SimplePaymentFactory.createMerchant(ApplePay.class);
            int payResult = merchant.payBill();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
