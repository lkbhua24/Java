package com.lkbhua.Test;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args){
        /*  需求：给你一个整数
        如果x是一个回文整数，则返回true，否则返回false
          回文整数：例如121 倒过来也是121
        * */

        // 核心思路：把数字倒过来跟源数字比较
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // 定义一个临时变量用于记录x原来的值，用于最后进行比较
        int temp = x;

        // 定义一个变量用于记录倒序后的数字
        int num = 0;

        // 利用循环获取每一位
        while (x!=0){
            // 从右往左获取
            int ge = x % 10;
            // 修改一下x记录的值
            x = x / 10;
            // 拼接数字
            num = num * 10 + ge;
        }

        // 判断
        if(temp == num){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
