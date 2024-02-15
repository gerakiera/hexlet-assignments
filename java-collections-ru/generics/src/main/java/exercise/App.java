package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static Map<String, String> findWhere(List<Map<String, String>> listOfBooks, Map<String, String> filterValues) {
        List<String> result = new ArrayList<>();
        var i = 0;
        for (var list : listOfBooks) {
            if (list.entrySet().containsAll(filterValues.entrySet())) {
                result.add(list.toString());
            }
        }
        return (Map<String, String>) result;
    }
}
//END
