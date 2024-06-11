package exercise;

import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
public class SingleTag extends Tag {

    public SingleTag(String tagName, Map<String, String> attributes) {
        super(tagName, attributes);
    }

    @Override
    public String toString() {
        String stringAttributes = "";
        if (!attributes.isEmpty()) {
            stringAttributes = super.attributesAsString(attributes);
        }
        return "<" + tagName + stringAttributes + ">";
    }


}
// END
