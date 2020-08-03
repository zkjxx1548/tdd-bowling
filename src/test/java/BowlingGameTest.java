import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BowlingGameTest {
    @Test
    void should_throw_exception_when_throw_given_error_input_of_one_to_nine_frame() {
        assertThrows(RuntimeException.class, () -> {
            new BowlingGame().convert("1,5,2,7,3,5,10,2,5,5,5,5,5,5,5,5,5,5,4,3,3,");
        });
        assertThrows(RuntimeException.class, () -> {
            new BowlingGame().convert("11,5,2,7,3,5,5,5,2,5,5,5,5,5,5,5,5,5,4,3");
        });
        assertThrows(RuntimeException.class, () -> {
            new BowlingGame().convert("-1,5,2,7,3,5,5,5,2,5,5,5,5,5,5,5,5,5,4,3");
        });
        assertThrows(RuntimeException.class, () -> {
            new BowlingGame().convert("5,6,2,7,3,5,4,5,2,5,5,5,5,5,5,5,5,5,4,3");
        });
    }

    @Test
    void should_return_all_score_when_throw_given_correct_input() {
        assertEquals(99, new BowlingGame().convert("1,9,2,8,3,7,10,2,8,5,5,5,5,5,5,5,5,5,4"));
    }

    @Test
    void should_return_all_score_when_throw_given_error_input_of_strike() {
        assertThrows(RuntimeException.class, () -> {
            new BowlingGame().convert("1,9,2,8,3,7,10,2,8,5,5,5,5,5,5,5,5,10,3,4,2");
        });
        assertThrows(RuntimeException.class, () -> {
            new BowlingGame().convert("1,9,2,8,3,7,10,2,8,5,5,5,5,5,5,5,5,10,5,6");
        });
        assertThrows(RuntimeException.class, () -> {
            new BowlingGame().convert("1,9,2,8,3,7,10,2,8,5,5,5,5,5,5,5,5,10,6,11");
        });
    }
}
