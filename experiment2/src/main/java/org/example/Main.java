package org.example;

import java.util.Scanner;

public class Main {
    static class IntRange {
        private final int start;
        private final int endInclusive;

        public IntRange(int start, int endInclusive) {
            this.start = start;
            this.endInclusive = endInclusive;
        }

        public boolean contains(int i) {
            return i >= start && i <= endInclusive;
        }
    }

    enum Type {
        UNDERWEIGHT(new IntRange(0, 19), new IntRange(0, 18), "您的体重过轻, 请加强膳食的补充!"),
        NORMAL(new IntRange(20, 24), new IntRange(19, 23), "您的体重正常, 请继续保持!"),
        OVERWEIGHT(new IntRange(25, 29), new IntRange(24, 28), "您的体重过重, 请注意锻炼身体!"),
        OBESE(new IntRange(30, 34), new IntRange(29, 33), "您已跨入肥胖行列, 请主要饮食习惯!"),
        VERY_OBESE(new IntRange(35, Integer.MAX_VALUE), new IntRange(34, Integer.MAX_VALUE), "您已经非常肥胖, 必须下定决心减肥了!");

        private final IntRange maleRange;
        private final IntRange femaleRange;
        private final String message;

        Type(IntRange maleRange, IntRange femaleRange, String message) {
            this.maleRange = maleRange;
            this.femaleRange = femaleRange;
            this.message = message;
        }

        public IntRange getMaleRange() {
            return maleRange;
        }

        public IntRange getFemaleRange() {
            return femaleRange;
        }

        public String getMessage() {
            return message;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入您的性别: ");
        String sex = scanner.next();

        if (!sex.equals("男") && !sex.equals("女")) {
            System.out.println("非法的性别.");
            return;
        }

        System.out.print("请输入您的身高: ");
        double height = scanner.nextDouble();

        if (height <= 0) {
            System.out.println("非法的身高.");
            return;
        }

        System.out.print("请输入您的体重: ");
        double weight = scanner.nextDouble();

        if (weight <= 0) {
            System.out.println("非法的身高.");
            return;
        }

        double bmi = weight / (height * height / 10000);

        System.out.printf("您的 BMI 是: %.2f\n", bmi);
        System.out.printf("您的 BMI 是: %d\n", Math.round(bmi));

        for (Type type : Type.values()) {
            IntRange range;

            if (sex.equals("男")) {
                range = type.maleRange;
            } else {
                range = type.femaleRange;
            }

            if (range.contains((int) bmi)) {
                System.out.println(type.message);
            }
        }
    }
}