package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag {
    public String tagName;
    public Map<String, String> attributes;

    public Tag(String tagName, Map<String, String> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public abstract String toString();

    public String attributesAsString(Map <String, String> attributes) {
        return attributes.keySet().stream()
                .map(key -> key + "=" + "\"" + attributes.get(key) + "\"")
                .collect(Collectors.joining(" ", " ", ""));
    }
    public String attributesAsString(Map <String, String> attributes, String suffix) {
        return attributes.keySet().stream()
                .map(key -> key + "=" + "\"" + attributes.get(key) + "\"")
                .collect(Collectors.joining(" ", " ", suffix));
    }

}
// END
