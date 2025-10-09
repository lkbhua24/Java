package com.lkbhua.Test;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        /*  需求：判断一个数是否是质数
        *   质数：只能被1和自身整除的数
        * */
        // 判断：
        // 写一个循环，从2开始，一直判断到num-1
        // 看这个范围之内，有没有数字可以被num整除
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();
        // 定义一个变量标记：标记num是否一个质数
        boolean flag = true;
        for(int i = 2; i < num; i++){
            if(num%i==0){
                flag = false;
                // System.out.println("不是质数");
                break;
            }
        }
        // 只有当循环结束了，表示这个范围之内所有的数字都没有被num整除，那么num就是质数
        if(flag){
            System.out.println("是质数");
        }else{
            System.out.println("不是质数");
        }
    }
}
