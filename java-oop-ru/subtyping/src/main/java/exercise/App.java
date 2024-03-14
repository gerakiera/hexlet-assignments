package exercise;

import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Objects;
//import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage keyValueStorage) {
        Map<String, String> result = keyValueStorage.toMap();
        Map<String, String> swappedKeyValueMap = new HashMap<>();
        for (Map.Entry<String, String> entry : result.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            swappedKeyValueMap.put(value, key);
            if (!swappedKeyValueMap.containsKey(value)) {
                swappedKeyValueMap.put(value, key);
            }
        }
        for (var k : keyValueStorage.keySet) {
            k.unset(k.keySet());
        }
        for (Map.Entry<String, String> entry : swappedKeyValueMap.entrySet()) {
            keyValueStorage.set(entry.getKey(), entry.getValue());
        }
    }
}
// END
