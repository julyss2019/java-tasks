import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }
}
