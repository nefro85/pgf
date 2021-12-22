package sygnowski.io.pgf.domain.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sygnowski.io.pgf.Status;

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

//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    Status add(@RequestBody Customer customer) {
//        repository.save(customer);
//        return Status.builder().ok("ok").build();
//    }


}
