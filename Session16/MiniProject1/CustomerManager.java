package Session16.MiniProject1;

import java.util.*;

public class CustomerManager {
    private Map<String, Customer> customerMap = new HashMap<>();

    public boolean register(Customer customer) {
        if (customerMap.containsKey(customer.getId())) {
            return false;
        }
        customerMap.put(customer.getId(), customer);
        return true;
    }

    public Customer findById(String id) {
        return customerMap.get(id);
    }

    public void showAll() {
        for (Customer customer : customerMap.values()) {
            System.out.println(customer);
        }
    }
}
