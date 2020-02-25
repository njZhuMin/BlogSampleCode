package example.abstractFactory;

public class ChinaMerchant implements IMerchant {
    @Override
    public void payBill() {
        System.out.println("ChinaMerchant is paying bill...");
    }
}
