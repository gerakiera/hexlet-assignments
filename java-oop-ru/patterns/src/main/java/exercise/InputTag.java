package exercise;

// BEGIN
public class InputTag implements TagInterface {
    String type;
    String value;
    public InputTag(String type, String value) {
        this.type = type;
        this.value = value;
    }
    @Override
    public String render(String type, String value) {
        return "<input type=\"" + type + "\" value=\"" + value + "\">";
    }
}
// END
