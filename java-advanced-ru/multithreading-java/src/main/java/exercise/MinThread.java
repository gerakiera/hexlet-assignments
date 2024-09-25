package exercise;

// BEGIN
public class MinThread extends Thread {
    private int[] arr;
    private int min;

    public MinThread(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        min = arr[0];
        for(var i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
    }

    public int getMin() {
        return min;
    }
}
// END
