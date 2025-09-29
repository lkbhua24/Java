package com.lkbhua.switchdemo;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        /*  需求：键盘录入星期数，输出工作日和休息日
        * */
        int day=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        day = sc.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入的星期数有误");
        }
    }
}

/*
还可以简化
switch (day){
case 1，2，3，4，5:
    System.out.println("工作日");
    break;
case 6，7:
    System.out.println("休息日");
    break;
default:
        System.out.println("输入的星期数有误");
        break;
}
还可以简化
switch (day){
case 1，2，3，4，5-> System.out.println("工作日");
case 6，7-> System.out.println("休息日");
default-> System.out.println("输入的星期数有误");
}
* */