package com.lkbhua.Test;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        /*  需求：商城都会有vip会员制度，假设商品为1000元
        键盘录入会员级别，并计算出实际支付的钱
        会员1级，打9折
        会员2级，打8折
        会员3级，打7折
        非会员，不打折
        * */
        int price = 1000;
        System.out.println("请输入会员级别：");
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();
        if(level == 1)
        {
            System.out.println("会员1级，打9折，实际支付：" + price * 0.9);
        }
        else if(level == 2)
        {
            System.out.println("会员2级，打8折，实际支付：" + price * 0.8);
        }
        else if(level == 3)
        {
            System.out.println("会员3级，打7折，实际支付：" + price * 0.7);
        }
        else
        {
            System.out.println("非会员，不打折，实际支付：" + price);
        }
        System.out.println("欢迎下次光临");
    }
}
