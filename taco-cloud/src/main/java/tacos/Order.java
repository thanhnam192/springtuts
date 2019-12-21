package tacos;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    private Date placedAt;

//end::newFields[]

    @NotBlank(message="Delivery name is required")
    private String deliveryName;

    @NotBlank(message="Street is required")
    private String deliveryStreet;

    @NotBlank(message="City is required")
    private String deliveryCity;

    @NotBlank(message="State is required")
    private String deliveryState;

    @NotBlank(message="Zip code is required")
    private String deliveryZip;


    private String ccNumber;


    private String ccExpiration;

    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;


    private List<Taco> tacos = new ArrayList<>();

    public void addDesign(Taco design) {
        this.tacos.add(design);
    }

    void placedAt() {
        this.placedAt = new Date();
    }
}
