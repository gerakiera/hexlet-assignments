package exercise;

//import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
//import java.util.concurrent.ArrayBlockingQueue;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> result = new ArrayList();
        int number = 3;
        for (var i = 0; i < expected.size(); i++) {
            result.add(input.get(i));
        }
        assertEquals(expected, result);

        // END
    }
}
