package exercise;

import java.util.Map;

// BEGIN
public class Tag {
    String tagName;
    Map<String, String> tagAttributes;
    public Tag (String tagName, Map<String, String> tagAttributes) {
        this.tagName = tagName;
        this.tagAttributes = tagAttributes;
    }
    public String getTagName() {
        return tagName;
    }
    public Map<String, String> getTagAttributes() {
        return tagAttributes;
    }
}
// END
