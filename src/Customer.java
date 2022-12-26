public class Customer implements ICustomer{

    //State
    int ID;
    String Name;

    //Constructor
    public Customer(int id,String name) {
        this.ID = id;
        this.Name = name;
    }

    //Behaviour
    @Override
    public String getCustomerName() {
        return this.Name;
    }

    @Override
    public double getPriceForProduct(double fullPrice) {
        return fullPrice*0.5;
    }
}
