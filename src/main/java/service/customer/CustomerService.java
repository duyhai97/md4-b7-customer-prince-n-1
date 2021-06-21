package service.customer;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ICustomerRepository;

import java.util.List;
import java.util.Optional;

public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerRepository repository;

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) repository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }

    @Override
    public void remove(Long id) {
        repository.delete(id);
    }
}
