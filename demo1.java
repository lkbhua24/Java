package com.lkbhua.switchdemo;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        /*  请输入1-7的数字，程序会输出对应的星期
        * */
        int week = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-7的数字：");
        week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入的数字有误");
                break;
        }
    }
}
// switch的知识点
/*
    default的位置和省略
    1.位置：default的位置不一定非要最下面，只是习惯写在最下面
    2.省略：default可以省略，但是不建议，语法也不会有问题

    case穿透
    1.如果没有发现case中含有break，那么程序会继续往下执行，直到遇到下一个break或者case或者default
    2.首先还是会根据小伙号的始入值找到相应的条件进去switch执行。

    switch新特性
    以上的写法还可以简写
    注意：只有当case执行的语句体内只有一条时才可以省略
    也可以把switch的值赋值也一个变量（后续会讲解）
    switch (week) {
        case 1-> System.out.println("星期一");
        case 2-> System.out.println("星期二");
        ------
        case 7-> System.out.println("星期日");
        default -> System.out.println("输入的数字有误");
    }

    switch和if各自的使用场景
    switch：把有限个数数据一一列举出来，让我们选择其一进行操作
    if：判断一个条件，如果满足则执行，否则不执行（一般是一个范围的判断）
* */
