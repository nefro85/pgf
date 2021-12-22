package sygnowski.io.pgf.domain.customer;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @OneToOne(mappedBy = "address")
    Customer customer;

    String city;

    String street;
    String postCode;
    String buildingNumber;
    String apartmentNumber;


}
