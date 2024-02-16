package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> list = new ArrayList<>(Arrays.asList(15, 8, 3, 20, 20, 7, 84, 11, 3));
        var count = 3;
        var actual1 = App.take(list, count);
        List<Integer> expected1 = new ArrayList<>();
        for (var i = 0; i < count; i++) {
            expected1.add(list.get(i));
        }
        assertThat(actual1).isEqualTo(expected1);

        var actual2 = App.take(list, 9);
        var expected2 = list;
        assertThat(actual2).isEqualTo(expected2);

        List<Integer> emptyList = new ArrayList<>();
        var actual3 = App.take(emptyList, 25);
        var expected3 = emptyList;
        assertThat(actual3).isEqualTo(expected3);

        var actual4 = App.take(list, 0);
        var expected4 = emptyList;
        assertThat(actual4).isEqualTo(expected4);
        // END
    }
}
