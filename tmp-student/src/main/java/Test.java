import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Class clazz = new Class();

        clazz.addStudent(new Undergraduate("00001", "张三", Arrays.asList(80D, 30D, 80D)));
        clazz.addStudent(new Graduate("00002", "李四", Arrays.asList(30D, 80D, 80D)));
        clazz.addStudent(new Undergraduate("00003", "王五", Arrays.asList(80D, 30D, 80D)));

        for (Student student : clazz.getStudents()) {
            System.out.printf("%s(%s): %s%n", student.getName(), student.getId(), student.calculateLevel());
        }
    }
}
