package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    String textOfTag;
    TagInterface tagInterface = new TagInterface();

    public LabelTag(String textOfTag, TagInterface tagInterface) {
        this.textOfTag = textOfTag;
        this.tagInterface = tagInterface;
    }
    public String render(String text, TagInterface tag) {
        return "<label>" + text + tag.render() + "</label>";
    }
}
// END
