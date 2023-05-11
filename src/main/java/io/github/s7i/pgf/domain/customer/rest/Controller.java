package io.github.s7i.pgf.domain.customer.rest;

import io.github.s7i.pgf.Status;
import io.github.s7i.pgf.domain.customer.Customer;
import io.github.s7i.pgf.domain.customer.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
@RequiredArgsConstructor
public class Controller {

    final CustomerService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> list() {
        return service.list();
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.CREATED)
    public Status add(@RequestBody Customer customer) {
        var c = service.addNewCustomer(customer);
        return Status.ok("consumer added", c);
    }
}
