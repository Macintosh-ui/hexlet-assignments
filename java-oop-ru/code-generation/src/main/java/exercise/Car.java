package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", getId());
        map.put("brand", getBrand());
        map.put("model", getModel());
        map.put("color", getColor());
        map.put("owner", getOwner());
        String result;
        var mapper = new ObjectMapper();
        try {
           result = mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static Car unserialize(String json) {
        Car car;
        var mapper = new ObjectMapper();
        try {
            car = mapper.readValue(json, Car.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return car;
    }
    // END
}
