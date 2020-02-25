package example.abstractFactory;

public abstract class AbstractPaymentFactory {

    public void init() {
        System.out.println("Initiating some data in abstractPaymentFactory...");
    }

    protected abstract IMerchant createMerchant();
    protected abstract IPreparePayment createPreparePayment();
}
