package exercise;

import java.util.Arrays;
import java.util.ArrayList;
//import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String chars, String word) {
        var newChars = chars.toLowerCase().toCharArray();
        var charList = new ArrayList<Character>();
        for (var c : newChars) {
            charList.add(c);
        }
        var newWord = word.toLowerCase().toCharArray();
        var charOfWord = new ArrayList<Character>();
        for (var w : newWord) {
            charOfWord.add(w);
        }
        for (var ch : charOfWord) {
            if (!charList.contains(ch))
                return  false;
        } else {
            return true;
        }
    }
}
//END
