package exercise.model;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
}
