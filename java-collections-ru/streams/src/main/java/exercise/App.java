package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    private static final List<String> FREE_DOMAINS = List.of(
            "gmail.com",
            "yandex.ru",
            "hotmail.com"
    );
    public static long getCountOfFreeEmails(List<String> emails){
        long result = emails.stream()
                            .map(email -> email.split("@")[1])
                            .filter(domain -> FREE_DOMAINS.contains(domain))
                            .count();
                return result;
    }
}
// END
