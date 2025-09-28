package com.lkbhua.loopdemo;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        /* 需求：键盘录入两个数字，表示一个范围
        求这个范围能别三整除，又能被五整除的数字有多少个并且输出
        * */

        // 分析：
        // 1，键盘录入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("录入两个数字表示范围：");
        System.out.println("请输入两个数字：");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;

        // 2.利用循环获取这个范围的每一个数字
        for(int i = start; i <= end; i++)
        {
            // 3.判断这个数字是否满足条件
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i);
                count++;
            }
        }
    }
}
