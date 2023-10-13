package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("********** 欢迎来到超级英雄抽奖系统 **********");
        System.out.println("点击s开始抽奖");

        Scanner scanner = new Scanner(System.in);
        String[] names = {"美国队长", "钢铁侠", "绿巨人", "蜘蛛侠", "黑寡妇", "鹰眼", "蝙蝠侠", "金刚狼", "泰迦奥特曼", "假面骑士zero one"};

        for (;;) {
            if (scanner.next().equals("s")) {
                for (int i = 0; i < 5; i++) {
                    for (String name : names) {
                        System.out.println(name);
                    }
                }

                int random = (int) (Math.random() * names.length);

                System.out.printf("恭喜 %s 中奖了%n", names[random]);
            } else {
                System.out.println("输入 s 以抽奖");
            }
        }
    }
}