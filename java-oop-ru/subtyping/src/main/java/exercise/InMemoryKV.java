package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> startValue = new HashMap<>();
    public InMemoryKV(Map<String, String> startValue) {
        this.startValue.putAll(startValue);
    }
    public void set(String key, String value) {
        startValue.put(key, value);
    }
    public void unset(String key) {
        startValue.remove(key);
    }
    public String get(String key, String defaultValue) {
        return startValue.getOrDefault(key, defaultValue);
    }
    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap<>();
        map.putAll(startValue);
        return map;
    }
}
// END
