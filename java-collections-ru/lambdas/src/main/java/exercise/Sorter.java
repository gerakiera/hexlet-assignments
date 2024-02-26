package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
//import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        List<String> oldestMans = users.stream()
            .filter(user -> "male".equals(user.get("gender")))
            .sorted(Comparator.comparing(user -> user.get("birthday"), Comparator.reverseOrder()))
            .map(user -> user.get("name"))
            .collect(Collectors.toList());
        return oldestMans;
    }
}
// END
