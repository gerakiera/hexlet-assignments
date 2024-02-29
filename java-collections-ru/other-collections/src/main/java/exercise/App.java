package exercise;

import java.util.*;
import java.util.stream.Collectors;


// BEGIN
public class App {
    public static Map<String, String> genDiff(Map<String, Objects> dictionaryOne,
                                                        Map<String, Objects> dictionaryTwo) {
        Map<String, String> result;
        result = dictionaryOne.entrySet().stream()
                .filter(e -> !dictionaryTwo.containsKey(e.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> "deleted"));

        result.putAll(dictionaryTwo.entrySet().stream()
                .filter(e -> !dictionaryOne.containsKey(e.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> "added")));

        result.putAll(dictionaryOne.entrySet().stream()
                .filter(e -> dictionaryTwo.containsKey(e.getKey()))
                .filter(e -> dictionaryTwo.get(e.getKey()).equals(e.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> "unchanged")));

        result.putAll(dictionaryOne.entrySet().stream()
                .filter(e -> dictionaryTwo.containsKey(e.getKey()))
                .filter(e -> !dictionaryTwo.get(e.getKey()).equals(e.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> "changed")));
        //LinkedHashMap<String, String> linkedHashMapResult = new LinkedHashMap<>(result);

        return result;
    }
}
//END
