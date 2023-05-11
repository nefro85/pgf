package io.github.s7i.pgf.domain.customer.dao;

import io.github.s7i.pgf.domain.customer.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {


}
