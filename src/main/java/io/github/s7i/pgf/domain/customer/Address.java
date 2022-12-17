package io.github.s7i.pgf.domain.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @JsonInclude(Include.NON_NULL)
    @OneToOne(mappedBy = "address")
    Customer customer;

    String city;

    String street;
    String postCode;
    String buildingNumber;
    String apartmentNumber;


}
