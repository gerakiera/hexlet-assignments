package exercise;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.sun.source.tree.BreakTree;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

// BEGIN
@AllArgsConstructor
@Getter
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
    ObjectMapper mapper = new ObjectMapper();
        String jsonToString = null;
    try {
        jsonToString = mapper.writeValueAsString(this);
    } catch (JsonProcessingException ex) {
        throw new RuntimeException();
    }
    return  jsonToString;
    }

    public static Car unserialize(String carJson) {
        ObjectMapper mapper = new ObjectMapper();
        Car result;
        try {
            result = mapper.readValue(carJson, Car.class);
        } catch (JsonParseException ex) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
    // END
}
