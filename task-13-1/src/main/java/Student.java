import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class Student {
    private final String id;
    private final String name;
    private final List<Double> scores;

    public Student(String id, String name, List<Double> scores) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        Objects.requireNonNull(scores);
        
        if (scores.contains(null)) {
            throw new NullPointerException();
        }
        
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

    public List<Double> getScores() {
        return Collections.unmodifiableList(scores);
    }

    abstract double getGradeLevel();
}
