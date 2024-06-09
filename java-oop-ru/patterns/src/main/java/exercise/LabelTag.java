package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    TagInterface tag;
    String label;
    public LabelTag( String label, TagInterface tag) {
        this.tag = tag;
        this.label = label;
    }

    @Override
    public String render() {
        return "<label>" + label + tag.render()+ "</label>";
    }
}
// END
