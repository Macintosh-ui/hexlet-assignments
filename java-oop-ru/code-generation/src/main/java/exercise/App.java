package exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {

    public static void save(Path path, Car car) {
        String serialized = car.serialize();
        try {
            Files.write(path, serialized.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Car extract(Path path) {
        Car car = null;
        List<String> jsonCar;
        try {
            jsonCar = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String stringCar = jsonCar.stream()
        .map(n -> String.valueOf(n))
        .collect(Collectors.joining(" "));

        car = Car.unserialize(stringCar);
        return car;
    }
}
// END
