package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
//import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> listOfBooks,
                                                Map<String, String> filterValues) {
        List<Map<String, String>> result = new ArrayList<>();
        var i = 0;
        for (var book : listOfBooks) {
            if (book.entrySet().containsAll(filterValues.entrySet())) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
