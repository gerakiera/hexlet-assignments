package exercise;

import java.util.Arrays;
import java.util.List;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        int rows = image.length;
        int cols = image[0].length;

        String[][] enlargedImage = new String[rows * 2][cols * 2];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                enlargedImage[2*i][2*j] = image[i][j];
                enlargedImage[2*i][2*j+1] = image[i][j];
                enlargedImage[2*i+1][2*j] = image[i][j];
                enlargedImage[2*i+1][2*j+1] = image[i][j];
            }
        }

        return enlargedImage;
    }
}
// END
