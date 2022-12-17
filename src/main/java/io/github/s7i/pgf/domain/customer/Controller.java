package io.github.s7i.pgf.domain.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import io.github.s7i.pgf.Status;

import java.util.List;

@RestController
@RequestMapping("api/customer")
@RequiredArgsConstructor
public class Controller {

    final CustomerRepository repository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<Customer> list() {
        return (List<Customer>) repository.findAll();
    }

    @PostMapping(
          consumes = MediaType.APPLICATION_JSON_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
    )
    Status add(@RequestBody Customer customer) {
        var c = repository.save(customer);
        return Status.ok("consumer added", c);
    }
}
