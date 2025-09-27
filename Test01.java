package com.lkbhua.test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        /* 需求：键盘录入一个整数：表示身上的钱
        如果大于等于100，可以吃网红餐厅
        如果小于100，可以吃沙县小吃
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入钱数：");
        int money = sc.nextInt();
        if(money>=100){
            System.out.println("吃网红餐厅");

        }
        else{
            System.out.println("吃沙县小吃");

        }
    }
}
