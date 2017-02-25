package nl.michielwittkampf;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Recept {

    @Id
    @GeneratedValue
    Long id;

    String titel;

    @ElementCollection
    List<String> ingredienten;

    String omschrijving;
}
