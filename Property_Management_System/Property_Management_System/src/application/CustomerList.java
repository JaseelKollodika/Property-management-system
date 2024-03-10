package application;
import java.io.Serializable;
import java.util.ArrayList;

public class CustomerList implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Customer> customers;

    public CustomerList() {
        customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}