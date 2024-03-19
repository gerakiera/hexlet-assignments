package exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path filePath, Car car) throws IOException {
    String result = car.serialize();
    Files.writeString(filePath, result);
    }
    public static Car extract(Path filePath) throws IOException {
    String content = Files.readString(filePath);
    return Car.unserialize(content);
    }
}
// END
