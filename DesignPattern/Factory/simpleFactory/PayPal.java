package example.simpleFactory;

public class PayPal implements IMerchant {

    public PayPal() {
        System.out.println("Merchant [" + this.getMerchant() +
                "] is created successfully");
    }

    @Override
    public String getMerchant() {
        return "PayPal";
    }

    @Override
    public int payBill() {
        System.out.println("Payment succeeded by [" + this.getMerchant() + "].");
        return 0;
    }
}
