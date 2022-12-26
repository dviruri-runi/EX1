import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ICustomer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Customer 1"));
        customers.add(new SilverCustomer(2, "Customer 2"));
        customers.add(new GoldCustomer(3, "Customer 3"));
        customers.add(new Customer(4, "Customer 4"));
        customers.add(new Customer(5, "Customer 5"));
        customers.add(new GoldCustomer(6, "Customer 6"));
        customers.add(new Customer(7, "Customer 7"));
        customers.add(new Customer(8, "Customer 8"));
        customers.add(new SilverCustomer(9, "Customer 9"));
        customers.add(new SilverCustomer(10, "Customer 10"));

        for (ICustomer customer : customers) {
            System.out.println("For 300 Product, " + customer.getCustomerName() + " Will pay " + customer.getPriceForProduct(300));
            System.out.println("For 3800 Product, " + customer.getCustomerName() + " Will pay " + customer.getPriceForProduct(3800));
        }
    }
}