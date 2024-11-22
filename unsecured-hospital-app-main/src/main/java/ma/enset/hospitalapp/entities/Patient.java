package ma.enset.hospitalapp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Entity //annotation JPA
@Data @NoArgsConstructor @AllArgsConstructor @Builder //annotation lombok
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //annotation JPA
    private Long id;
    @NotEmpty @Size(min = 4, max = 20) //annotation de validation
    private String nom;
    @Temporal(TemporalType.DATE) //annotation JPA
    private Date dateNaissance;
    private boolean malade;
    @Min(10) //annotation de validation
    private int score;
}
