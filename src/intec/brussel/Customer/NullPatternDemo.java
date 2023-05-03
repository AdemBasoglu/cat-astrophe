package intec.brussel.Customer;


public class NullPatternDemo {

    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");

        System.out.printf("%s\n", "Customers");
        System.out.printf("%s\n",customer1.getName());
        System.out.printf("%s\n",customer2.getName());
        System.out.printf("%s\n",customer3.getName());
    }
}