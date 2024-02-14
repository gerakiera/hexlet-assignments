package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public  class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        var wordCount = new HashMap<String, Integer>();
        var sentenceArr = sentence.split(" ");
        if (sentence.isEmpty()) {
            return wordCount;
        }
        for (var s : sentenceArr) {
            var count = 0;
            if (!wordCount.containsKey(s)) {
                wordCount.put(s, 1);
            }
                wordCount.put(s, wordCount.get(s) + 1);
        }
        return wordCount;
    }
    public static String toString(Map<String, Integer> wordCount) {
        var keys = wordCount.keySet();
        var values = wordCount.values();
        StringBuilder result = new StringBuilder();
        for (var key : keys) {
            for (var value : values) {
                result = new StringBuilder("\n" + "  " + key + ":  " +
                        value);
            }
        }
        return "{" + result + "\n}";
    }
}
//END
