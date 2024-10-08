package exercise.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import static jakarta.persistence.GenerationType.IDENTITY;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

// BEGIN
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @EqualsAndHashCode.Include
    private String title;

    @EqualsAndHashCode.Include
    private int price;
}
// END
