import java.util.ArrayList;
import java.util.List;

public abstract class Student {
    private final String id;
    private final String name;
    private final List<Double> scores;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.scores = new ArrayList<>();
    }

    public Student(String id, String name, List<Double> scores) {
        this.id = id;
        this.name = name;
        this.scores = new ArrayList<>(scores);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addScore(double score) {
        scores.add(score);
    }

    protected double getAverageScore() {
        return scores.stream().mapToDouble(Double::doubleValue).sum() / scores.size();
    }

    abstract String calculateLevel();
}
