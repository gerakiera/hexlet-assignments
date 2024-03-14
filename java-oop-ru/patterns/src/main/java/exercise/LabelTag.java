package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    String textOfTag;
    TagInterface tagInterface;

    public LabelTag(String textOfTag, TagInterface tagInterface) {
        this.textOfTag = textOfTag;
        this.tagInterface = tagInterface;
    }
    @Override
    public String render() {
        return "<label>" + this.textOfTag + this.tagInterface.render() + "</label>";
    }
}
// END
