package exercise;

//import java.util.*;
//import java.util.stream.Collectors;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {
    public static Map<String, String> genDiff(Map<String, Object> dictionaryOne,
                                                        Map<String, Object> dictionaryTwo) {
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
