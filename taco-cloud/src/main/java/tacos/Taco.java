package tacos;

import java.util.Date;
import java.util.List;
// end::allButValidation[]
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
// tag::allButValidation[]
import lombok.Data;


@Data
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    // end::allButValidation[]
    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;


    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<String> ingredients;

    private Date createdAt;

    @PrePersist
    void createdAt() {
        this.createdAt = new Date();
    }
}