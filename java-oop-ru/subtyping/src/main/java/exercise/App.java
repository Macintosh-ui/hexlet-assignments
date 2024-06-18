package exercise;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> transferMap = new HashMap<>(storage.toMap());
        for (String key : transferMap.keySet()) {
            storage.unset(key);
        }
        transferMap.forEach((key, value) -> {
            storage.set(value, key);
        });
    }
}
// END
