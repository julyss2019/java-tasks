import java.util.List;

public class Graduate extends Student {
    public Graduate(String id, String name) {
        super(id, name);
    }

    public Graduate(String id, String name, List<Double> scores) {
        super(id, name, scores);
    }

    @Override
    String calculateLevel() {
        double avgScore = getAverageScore();

        if (avgScore >= 90 && avgScore <= 100) {
            return "优秀";
        }

        if (avgScore >= 80 && avgScore < 90) {
            return "良好";
        }

        if (avgScore >= 70 && avgScore < 80) {
            return "一般";
        }

        if (avgScore >= 60 && avgScore < 70) {
            return "及格";
        }

        return "不及格";
    }
}
