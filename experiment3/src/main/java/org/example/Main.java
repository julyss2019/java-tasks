package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        List<String> heroes = Arrays.asList( "美国队长", "钢铁侠", "绿巨人", "蜘蛛侠", "黑寡妇", "鹰眼", "蝙蝠侠", "金刚狼", "泰迦奥特曼", "假面骑士zero one");

        System.out.println("********** 欢迎来到超级英雄抽奖系统 **********");
        inputStart(scanner);

        System.out.println("请输入数量: ");
        int n = inputAmount(scanner, heroes);

        for (int i = 0; i < 5; i++) {
            for (String hero : heroes) {
                System.out.println(hero);
                Thread.sleep(200);
            }
        }

        if (n == 1) {
            System.out.printf("恭喜 %s 中奖了%n", lottery(heroes));
        } else {
            System.out.printf("恭喜以下 %d 位中奖了%n", n);
            List<String> current = new ArrayList<>(heroes);

            for (int i = 0; i < n; i++) {
                String tmp = lottery(current);

                System.out.println(tmp);
                current.remove(tmp);
            }
        }
    }

    private static void inputStart(Scanner scanner) {
        do {
            System.out.println("输入 s 以开始抽奖");
        }
        while (!"s".equals(scanner.next()));
    }

    private static int inputAmount(Scanner scanner, List<String> heros) {
        int n;

        while ((n = scanner.nextInt()) <= 0 || n > heros.size()) {
            System.out.println("数量不合法.");
        }

        return n;
    }

    private static String lottery(List<String> heroes) {
        return heroes.get((int) (Math.random() * heroes.size()));
    }
}
