package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    String word;

    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {
        return word.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return word.substring(start, end);
    }
    @Override
    public String toString() {
        char[] array = word.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }
}
// END
