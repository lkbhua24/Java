package com.lkbhua.Test;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args){
        /*  需求：键盘录入一个大于等于2的整数x，计算并返回x的平方根
            结果只保留整数部分，小数部分将被舍去
        * */
        // 分析：
        // 10
        // 1*1=1<10;
        // 2*2=4<10;
        // 3*3=9<10;
        // 4*4=16>10;
        // 推断：10的平方根在3-4之间

        // 在代码中
        // 从1开始循环，拿着数字的平方跟原来的数字进行比较
        // 如果小于的，那么继续往后判断
        // 如果相等，那么当前数字就是平方根
        // 如果大于的，那么前一个数字就是平方根的整数部分
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            if(i * i == num){
                System.out.println(i+"就是"+ num+"的平方根");
                break;
            }else if(i * i > num){
                System.out.println((i - 1)+"就是"+ num+"的平方根");
                break;
            }
        }


    }
}
