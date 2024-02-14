package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public  class App {
    public static Map<String, Integer> getWordCount(String sentenсe) {
        var wordCount = new HashMap<String, Integer>;
        var sentenceArr = sentenсe.split(" ");
        if (sentenсe.isEmpty()) {
            return wordCount;
        }
        for (var s : sentenceArr) {
            var count = 0;
            if (!wordCount.containsKey(s)) {
                wordCount.put(s, count);
            }
                wordCount.put(s, count++);
            return wordCount;
       }
    }
    public static String toString(Map<String, Integer> wordCount) {
        var keys = wordCount.keySet();
        var values = wordCount.values();
        String result = null;
        for (var key : keys) {
            for (var value : values) {
                result = "{" + "\n" + "  " + key + ":  " +
                        value + "\n";
            }
        }
        return result;
    }
}
//END
