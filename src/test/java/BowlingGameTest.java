import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BowlingGameTest {
    @Test
    void should_throw_exception_when_throw_given_error_input_of_one_to_nine_frame() {
        assertThrows(RuntimeException.class, () -> {
            new BowlingGame().convert("1,5,2,7,3,5,10,2,5,5,5,5,5,5,5,5,5,5,4,9");
        });

    }

}
