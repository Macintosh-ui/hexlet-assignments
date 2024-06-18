package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> map;

    InMemoryKV(Map<String, String> map) {
        this.map = new HashMap<>();
        this.map.putAll(map);
    }

    public void set(String key, String value) {
        this.map.put(key, value);
    }

    public void unset(String key) {
        this.map.remove(key);
    }

    public String get(String key, String defaultValue) {
        if (!this.map.containsKey(key)) {
            return defaultValue;
        }
        return this.map.get(key);
    }

    public Map<String, String> toMap() {
        return new HashMap<>(this.map);
    }
}
// END
