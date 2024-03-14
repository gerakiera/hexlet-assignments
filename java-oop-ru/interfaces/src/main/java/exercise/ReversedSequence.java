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
        return new StringBuilder(word).reverse().toString();
    }
}
// END
