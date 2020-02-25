package example.abstractFactory;

public class ChinaPreparePayment implements IPreparePayment {
    @Override
    public void preparePaymentEnvironment() {
        System.out.println("Preparing payment environment for China merchants...");
    }
}
