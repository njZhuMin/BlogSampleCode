package example.simpleFactory;

public class ApplePay implements IMerchant {

    public ApplePay() {
        System.out.println("Merchant [" + this.getMerchant() +
                "] is created successfully");
    }

    @Override
    public String getMerchant() {
        return "ApplePay";
    }

    @Override
    public int payBill() {
        System.out.println("Payment succeeded by [" + this.getMerchant() + "].");
        return 0;
    }
}
