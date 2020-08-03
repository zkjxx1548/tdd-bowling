import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void should_return_origin_score_when_convert_given_number_of_pins_by_not_knock_all_pins() {
        BowlingGame bowlingGame = new BowlingGame();

        int numberPin = new Random().nextInt(10);
        int result = bowlingGame.convert(numberPin);

        assertEquals(numberPin, result);
    }


}
