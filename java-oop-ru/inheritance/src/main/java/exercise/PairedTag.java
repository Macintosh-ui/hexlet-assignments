package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {

    private String tagBody;
    private List<Tag> children;

    public PairedTag(String tagName, Map<String, String> attributes, String tagBody, List<Tag> children) {
        super(tagName, attributes);
        this.tagBody = tagBody;
        this.children = children;
    }

    public String listFormatter(List<Tag> children) {
        String result = children.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
        return result;
    }

    @Override
    public String toString() {
        String childrenList = "";
        String attributeList = ">";
        if (!attributes.isEmpty()) {
            attributeList = super.attributesAsString(attributes, ">");
        }
        if (!children.isEmpty()) {
            childrenList = listFormatter(children);
        }
        return "<" + tagName + attributeList + tagBody + childrenList + "</" + tagName + ">";
    }
}
// END
