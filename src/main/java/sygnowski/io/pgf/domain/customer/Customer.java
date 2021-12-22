package sygnowski.io.pgf.domain.customer;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    @OneToOne
    Address address;

}
