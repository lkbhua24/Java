package com.lkbhua.Test;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args){
        /*  需求：输入一个年龄。
        判断是儿童还是少年还是青年还是中年还是老年还是神仙
        儿童（0-11）
        少年（12-17）
        青年（18-30）
        中年（31-50）
        老年（51-70）
        * */
        System.out.println("请输入年龄：");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=0 && age<=11){
            System.out.println("儿童");
        }
        else if(age>=12 && age<=17){
            System.out.println("少年");
        }
        else if(age>=18 && age<=30){
            System.out.println("青年");
        }
        else if(age>=31 && age<=50){
            System.out.println("中年");
        }
        else if(age>=51 && age<=70){
            System.out.println("老年");
        }
        else{
            System.out.println("神仙");
        }
    }
}
