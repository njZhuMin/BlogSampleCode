package example.abstractFactory;

public class ForeignMerchantFactory extends AbstractPaymentFactory {
    @Override
    protected IMerchant createMerchant() {
        super.init();
        return new ForeignMerchant();
    }

    @Override
    protected IPreparePayment createPreparePayment() {
        super.init();
        return new ForeignPreparePayment();
    }
}
