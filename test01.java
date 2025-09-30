package com.lkbhua.Test;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args){
        /* 输入一个整数票号，如果是偶数票号坐到左边座位
        * 奇数票号坐到右边座位
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数票号：");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("坐左边座位");
        }
        else {
            System.out.println("坐右边座位");
        }

    }
}
