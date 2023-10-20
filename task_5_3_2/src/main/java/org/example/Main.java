package org.example;

public class Main {
    public static void main(String[] args) {
        // 编写一个测试程序，创建两个Rectangle对象——一个矩形的宽为4而高为40，另一个矩形的宽为3.5，而高为35.9。按照这个顺序显示每个矩形的宽、高、面积和周长。
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        rectangle1.show();
        rectangle2.show();
    }
}