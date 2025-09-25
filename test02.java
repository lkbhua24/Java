package com.lkbhua.operators.com.lkbhua;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args){
        /* 需求:
        您和您的约会对象正试图在餐厅的一张桌子吃饭
        键盘录入两个整数，表示你和你的约会对象的衣服时髦程度（手动录入0-10的整数，不能是其他）
        如果你的时髦程度大于你的约会对象的时髦程度，则相亲成功输出true
        否则输出false
        * */

        // 1。键盘录入两个整数表示衣服时髦程度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的时髦程度：");
        int myLevel = sc.nextInt();
        System.out.println("请输入你的约会对象的时髦程度：");
        int yourLevel = sc.nextInt();

        // 2.把我衣服的时髦程度跟女孩的时髦程度进行比较
        boolean result = myLevel > yourLevel;

        // 3.打印结果
        System.out.println(result);
    }

}
