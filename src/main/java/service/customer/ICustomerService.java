package service.customer;

import model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
