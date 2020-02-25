package example.simpleFactory;

public class AliPay implements IMerchant {

    public AliPay() {
        System.out.println("Merchant [" + this.getMerchant() +
                "] is created successfully");
    }

    @Override
    public String getMerchant() {
        return "AliPay";
    }

    @Override
    public int payBill() {
        System.out.println("Payment succeeded by [" + this.getMerchant() + "].");
        return 0;
    }
}
