public class Student {
    private String name;
    private String id;
    private final double[] scores = new double[3];

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean setScore(double[] score) {
        for (int i = 0; i < 3; i++) {
            if (score[i] < 0 || score[i] > 100) {
                return false;
            }

            scores[i] = score[i];
        }

        return true;
    }

    public double[] getScores() {
        return scores;
    }

    public double sum() {
        double total = 0;
        for (int i = 0; i < 3; i++) {
            total += scores[i];
        }
        return total;
    }

    public double average() {
        return sum() / 3;
    }

    public double[] max_min() {
        double maxScore = scores[0];
        double minScore = scores[0];
        for (int i = 1; i < 3; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
            if (scores[i] < minScore) {
                minScore = scores[i];
            }
        }
        double[] maxMin = {maxScore, minScore};
        return maxMin;
    }

    public void printf() {
        System.out.println("成绩总分: " + sum());
        System.out.println("平均分: " + average());
        double[] maxMin = max_min();
        System.out.println("最高分: " + maxMin[0]);
        System.out.println("最低分: " + maxMin[1]);
    }
}

 class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("张三", "2023001");
        double[] scores = {85, 90, 78};

        if (student.setScore(scores)) {
            System.out.println("学生姓名: " + student.getName());
            System.out.println("学号: " + student.getID());
            student.printf();
        } else {
            System.out.println("成绩非法，请输入合法成绩（0-100之间）");
        }
    }
}
