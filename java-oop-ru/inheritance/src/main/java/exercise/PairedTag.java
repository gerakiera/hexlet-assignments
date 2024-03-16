package exercise;

import java.util.List;
import java.util.Map;

// BEGIN
public class PairedTag extends Tag {
    String tagBody;
    List<Tag> children;
    public PairedTag(String tagName, Map<String, String> tagAttributes, String tagBody, List<Tag> children) {
        super(tagName, tagAttributes);
        this.tagBody = tagBody;
        this.children = children;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("<");
        result.append(getTagName());
        for (Map.Entry<String, String> entry : getTagAttributes().entrySet()) {
            result.append(" " + entry.getKey() + "=\"" + entry.getValue() + "\"");
        }
        result.append(">" + tagBody);
        for (Tag c : children) {
            result.append(c.toString());
        }
        result.append("</" + getTagName() + ">");
        return result.toString();
    }
}
// END
