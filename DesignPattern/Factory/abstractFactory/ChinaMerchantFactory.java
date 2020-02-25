package example.abstractFactory;

public class ChinaMerchantFactory extends AbstractPaymentFactory {
    @Override
    protected IMerchant createMerchant() {
        super.init();
        return new ChinaMerchant();
    }

    @Override
    protected IPreparePayment createPreparePayment() {
        super.init();
        return new ChinaPreparePayment();
    }
}
