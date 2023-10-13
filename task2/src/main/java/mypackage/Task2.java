package mypackage;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // 根据学生成绩（成绩在0～100之间）输出等级：当成绩大于90（含90），输出A；当成绩在80-90之间（含80），输出B ；当成绩在60-80之间（含60），输出C；当成绩小于60，输出D，分别用if语句和switch语句实现
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩: ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("非法成绩.");
            return;
        }

        char ifLevel = '-';

        if (score >= 90) {
            ifLevel = 'A';
        } else if (score >= 80) {
            ifLevel = 'B';
        } else if (score >= 60) {
            ifLevel = 'C';
        } else {
            ifLevel = 'D';
        }

        char switchLevel = '-';

        switch (score / 10) {
            case 10:
            case 9:
                switchLevel = 'A';
                break;
            case 8:
                switchLevel = 'B';
                break;
            case 7:
            case 6:
                switchLevel = 'C';
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                switchLevel = 'D';
                break;
        }

        System.out.println("等级: " + ifLevel);
        System.out.println("等级: " + switchLevel);
    }
}
