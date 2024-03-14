package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> list, int number) {
        List<String> result = new ArrayList<>();
        List<Home> sortedList = list.stream().sorted(Comparator.comparingInt(Home::getAge))
                .collect(Collectors.toList());
        for (var i = 0; i < Math.min(number, sortedList.size()); i++) {
            result.add(sortedList.get(i).toString());
        }
        return result;
    }
}
// END
