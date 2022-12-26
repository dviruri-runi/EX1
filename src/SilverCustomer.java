public class SilverCustomer extends Customer {

    //Constructor
    public SilverCustomer(int id,String name) {
        super(id,name);
    }

    //Behaviour

    @Override
    public double getPriceForProduct(double fullPrice) {
        if (fullPrice > 500) {
            return super.getPriceForProduct(fullPrice)*0.85;
        } else {
            return super.getPriceForProduct(fullPrice);
        }
    }
}
