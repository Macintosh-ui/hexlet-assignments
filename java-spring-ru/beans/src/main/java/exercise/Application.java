package exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;

import exercise.daytime.Daytime;
import exercise.daytime.Day;
import exercise.daytime.Night;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.context.annotation.RequestScope;

// BEGIN

// END

@SpringBootApplication
public class Application {
    private LocalDateTime dateTime;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // BEGIN
    @RequestScope
    @Bean
    @Primary
    public Daytime daytime() {
        LocalTime minimal = LocalTime.of(6, 0, 0, 0);
//        LocalTime maximum = LocalTime.of(12, 0, 0, 0);

        if (LocalTime.now().isAfter(minimal)) {
            return new Day();
        } else {
            return new Night();
        }
    }
    // END
}
