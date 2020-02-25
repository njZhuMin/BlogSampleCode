package example.abstractFactory;

public class ForeignMerchant implements IMerchant {
    @Override
    public void payBill() {
        System.out.println("ForeignMerchant is paying bill...");
    }
}
