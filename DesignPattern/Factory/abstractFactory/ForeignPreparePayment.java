package example.abstractFactory;

public class ForeignPreparePayment implements IPreparePayment {
    @Override
    public void preparePaymentEnvironment() {
        System.out.println("Preparing payment environment for Foreign merchants...");
    }
}
