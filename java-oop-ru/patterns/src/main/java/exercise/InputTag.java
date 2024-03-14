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
    public String render(String typeOne, String valueOne) {
        return "<input type=\"" + typeOne + "\" value=\"" + valueOne + "\">";
    }
}
// END
