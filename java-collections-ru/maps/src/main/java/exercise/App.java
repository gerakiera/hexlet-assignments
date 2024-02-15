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
            if (!wordCount.containsKey(s)) {
                wordCount.put(s, 0);
            }
            wordCount.put(s, wordCount.get(s) + 1);
        }
        return wordCount;
    }
    public static String toString(Map<String, Integer> wordCount) {
        var keys = wordCount.keySet();
        var values = wordCount.values();
        StringBuilder result = new StringBuilder("{\n");
        if (wordCount.isEmpty()) {
            return "{}";
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            result.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        result.append("}");
        return result.toString();
    }
}
//END
