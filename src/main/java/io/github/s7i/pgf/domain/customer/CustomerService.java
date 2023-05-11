package io.github.s7i.pgf.domain.customer;

import io.github.s7i.pgf.domain.customer.dao.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }
    @Transactional(readOnly = true)
    public List<Customer> list() {
        return (List<Customer>) repository.findAll();
    }
    public Customer addNewCustomer(Customer customer) {
        return repository.save(customer);
    }
}
