package com.lkbhua.operators.com.lkbhua;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        // 键盘输入一个三位数，获取其中的个位，十位，百位

        // 1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();
        // 2.获取个位
        int ge = number % 10;
        // 3.获取十位
        int shi = number / 10 % 10;
        // 4.获取百位
        int bai = number / 100;
        // 5.打印结果
        System.out.println("个位:" + ge);
        System.out.println("十位:" + shi);
        System.out.println("百位:" + bai);

    }
}
