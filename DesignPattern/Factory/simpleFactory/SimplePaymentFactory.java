package example.simpleFactory;

public class SimplePaymentFactory {
    private SimplePaymentFactory() {}

    public static IMerchant createMerchant(Class<? extends IMerchant> clazz) throws Exception {
        if (null == clazz) {
            throw new Exception("Error merchant for payment.");
        }
        return clazz.getDeclaredConstructor().newInstance();
    }

    // version 1: Client must know the params he passed
    // Whenever a new merchant is added, must modify both this factory method and caller
    public static IMerchant createMerchant(String merchantName) throws Exception {
        switch (merchantName) {
            case "AliPay":
                return new AliPay();
            case "WechatPay":
                return new WechatPay();
            case "UnionPay":
                return new UnionPay();
            case "ApplePay":
                return new ApplePay();
            case "PayPal":
                return new PayPal();
            default:
                throw new Exception("Error creating merchant " + merchantName);
        }
    }
}
