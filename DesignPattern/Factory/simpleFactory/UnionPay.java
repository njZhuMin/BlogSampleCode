package example.simpleFactory;

public class UnionPay implements IMerchant {

    public UnionPay() {
        System.out.println("Merchant [" + this.getMerchant() +
                "] is created successfully");
    }

    @Override
    public String getMerchant() {
        return "UnionPay";
    }

    @Override
    public int payBill() {
        System.out.println("Payment succeeded by [" + this.getMerchant() + "].");
        return 0;
    }
}
