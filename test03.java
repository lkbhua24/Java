package com.lkbhua.operators.com.lkbhua;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        /*
        键盘输入两个整数，如果其中一个为6，最终结果输出true
        如果它们的和为6的倍数，最终结果输出true
        其他情况都是false
        */
        // 分析：
        // 1.键盘输入两个整数
        // 变量a   变量b

        // 2.a == 6 || b == 6 || a + b == 6
        // 如果满足其中的一个则输出true

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        boolean result = a == 6 || b == 6 || a + b == 6;
        System.out.println(result);

    }
}
