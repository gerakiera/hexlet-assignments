package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag (String tagName, Map<String, String> tagAttributes) {
        super(tagName, tagAttributes);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("<");
        result.append(getTagName());
        for (Map.Entry<String, String> entry : getTagAttributes().entrySet()) {
            result.append(" " + entry.getKey() + "=\"" + entry.getValue() + "\"");
        }
        result.append(">");
        //System.out.println(result.toString());
        return result.toString();
    }
}
// END
