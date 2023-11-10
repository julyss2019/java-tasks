import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Class clazz = new Class();

        clazz.addStudent(new Undergraduate("00001", "小明", Arrays.asList(50.5D, 60D, 70D)));
        clazz.addStudent(new Graduate("00002", "小红", Arrays.asList(100D, 70D, 80D)));

        for (Student student : clazz.getStudents()) {
            System.out.printf("%s(%s): %s%n", student.getName(), student.getId(), student.calculateLevel());
        }
    }
}
