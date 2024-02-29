package exercise;

import java.util.*;
import java.util.stream.Collectors;


// BEGIN
public class App {
    public static Map<String, String> genDiff(Map<String, Objects> dictionaryOne,
                                                        Map<String, Objects> dictionaryTwo) {
        Map<String, String> result = new LinkedHashMap<>();
        Set<String> keys = new TreeSet<>(dictionaryOne.keySet());
        keys.addAll(dictionaryTwo.keySet());

        for (String key: keys) {
            if (!dictionaryOne.containsKey(key)) {
                result.put(key, "added");
            } else if (!dictionaryTwo.containsKey(key)) {
                result.put(key, "deleted");
            } else if (dictionaryOne.get(key).equals(dictionaryTwo.get(key))) {
                result.put(key, "unchanged");
            } else {
                result.put(key, "changed");
            }
        }
        return result;
    }
}
//END
