package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        List<String> allNulls = new ArrayList<>();
        Field[] field = address.getClass().getDeclaredFields();
        for (Field f : field) {
            NotNull notNull = f.getAnnotation(NotNull.class);
            try {
                f.setAccessible(true);
                if (notNull != null && f.get(address) == null) {
                    allNulls.add(f.getName());
                }
            } catch (IllegalAccessException ex) {
                throw new RuntimeException();
            }
        }
        return allNulls;
    }
}
// END
