public class Student {
    private String name;
    private String ID;
    private double[] score = new double[3];

    public Student(String a, String b) {
        name = a;
        ID = b;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public boolean setScore(double[] fenshu) {
        for (int i = 0; i < 3; i++) {
            if (fenshu[i] < 0 || fenshu[i] > 100) {
                return false;
            }
            score[i] = fenshu[i];
        }
        return true;
    }

    public double[] getScore() {
        return score;
    }

    public double sum() {
        double total = 0;
        for (int i = 0; i < 3; i++) {
            total += score[i];
        }
        return total;
    }

    public double average() {
        return sum() / 3;
    }

    public double[] max_min() {
        double maxScore = score[0];
        double minScore = score[0];
        for (int i = 1; i < 3; i++) {
            if (score[i] > maxScore) {
                maxScore = score[i];
            }
            if (score[i] < minScore) {
                minScore = score[i];
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
