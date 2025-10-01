package com.lkbhua.Test;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args){
        /*  需求： 给定两个整数，被除数和除数（都是正数，且不超过int的范围）
            将两数相除，要求不使用乘法，除法和取余运算，并返回商和余数。
        * */
        // 思路：除法的本质就是计数被除数中有多少次可以被除数相减的倍

        // 提示用户输入两个数
        System.out.println("请输入被除数和除数:");

        // 获取用户输入
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        // 利用循环进行相减逻辑
        while(a>=b){
            a = a-b;
            count++;
        }
        // 输出结果
        System.out.println("商为："+count);
        System.out.println("余数为："+a);
    }
}
