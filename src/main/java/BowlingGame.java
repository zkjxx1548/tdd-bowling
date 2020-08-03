import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    public BowlingGame() {
    }

    public int convert(String string) {
        String[] scores = string.split(",");
        List<Integer> frameScores = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            int score = Integer.parseInt(scores[i]);
            int everFrameScore = 0;
            if (score < 10 && score >= 0) {
                everFrameScore = Integer.parseInt(scores[i]) + Integer.parseInt(scores[i + 1]);
                if (everFrameScore > 10) {
                    throw new ErrorInputException();
                }
                frameScores.add(Integer.parseInt(scores[i]) + Integer.parseInt(scores[i + 1]));
                ++i;
                continue;
            }
            if (score == 10) {
                frameScores.add(score);
                continue;
            }
            throw new ErrorInputException();
        }
        return getLineScore(frameScores);
    }

    public int getLineScore(List<Integer> frameScores) {
        return frameScores.stream()
                .reduce(Integer::sum)
                .orElse(-999);
    }
}
