package di;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customers = new HashMap<>();

    public CustomerRepositoryImpl() {
        customers.put("C101", new Customer("C101", "Anjali"));
        customers.put("C102", new Customer("C102", "Ravi"));
    }

    public Customer findCustomerById(String id) {
        return customers.get(id);
    }
}
