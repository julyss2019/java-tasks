import java.util.List;

public class Undergraduate extends Student {
    public Undergraduate(String id, String name) {
        super(id, name);
    }

    public Undergraduate(String id, String name, List<Double> scores) {
        super(id, name, scores);
    }

    @Override
    String calculateLevel() {
        double avgScore = getAverageScore();

        if (avgScore >= 80 && avgScore <= 100) {
            return "优秀";
        }

        if (avgScore >= 70 && avgScore < 80) {
            return "良好";
        }

        if (avgScore >= 60 && avgScore < 70) {
            return "一般";
        }

        if (avgScore >= 50 && avgScore < 60) {
            return "及格";
        }

        return "不及格";
    }
}
