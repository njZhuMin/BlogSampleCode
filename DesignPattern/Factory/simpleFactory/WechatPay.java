package example.simpleFactory;

public class WechatPay implements IMerchant {

    public WechatPay() {
        System.out.println("Merchant [" + this.getMerchant() +
                "] is created successfully");
    }

    @Override
    public String getMerchant() {
        return "WechatPay";
    }

    @Override
    public int payBill() {
        System.out.println("Payment succeeded by [" + this.getMerchant() + "].");
        return 0;
    }
}
