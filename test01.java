package com.lkbhua;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        /*  需求：机票价格按照淡季旺季、头等舱和经济收费、输入机票原价、月份和头等舱或经济舱
         *        按照如下规则计算机票价格：旺季（5-10月） 头等舱9折 经济舱8.5折，淡季（11-4月） 头等舱7折 经济舱6.5折
         * */
        // 1.键盘录入机票原价、月份和头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = sc.nextDouble();

        System.out.println("请输入月份：");
        int month = sc.nextInt();

        System.out.println("请输入头等舱或经济舱：");
        String type = sc.next();

        double price1 = getPrice(price,month,type);
        System.out.println("机票价格：" + price1);

    }
    public static double getPrice(double price,int month,String type) {
        // 2.判断月份是否在旺季
        if (month >= 5 && month <= 10) {
            if (type.equals("头等舱")) {
                price *= 0.9;
            }
            if (type.equals("经济舱")) {
                price *= 0.85;
            }
        }
        if (month >= 11 || month <= 4) {
            if (type.equals("头等舱")) {
                price *= 0.7;
            }
            if (type.equals("经济舱")) {
                price *= 0.65;
            }
        }
        return price;

    }
}

// ctrl+alt+M：自动抽取方法



