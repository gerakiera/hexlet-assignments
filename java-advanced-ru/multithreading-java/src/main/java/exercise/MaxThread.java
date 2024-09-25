package exercise;

// BEGIN
public class MaxThread extends Thread {
    private int[] arr;
    private int max;

    public MaxThread(int[] arr) {
        this.arr = arr;
    }
    @Override
    public void run() {
        max = arr[0];
        for(var i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    }

    public int getMax() {
        return max;
    }
}
// END
