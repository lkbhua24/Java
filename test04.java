package com.lkbhua.operators.com.lkbhua;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args){
        /* 需求：动物园有两只老虎，体重分别通过键盘录入
        请你利用程序代码来判断这两只老虎的体重是否相等
        * */

        // 分析：
        // 1.键盘录入两只老虎的体重
        System.out.println("请输入第一只老虎的体重：");
        Scanner sc = new Scanner(System.in);
        double weight1 = sc.nextDouble();
        System.out.println("请输入第二只老虎的体重：");
        double weight2 = sc.nextDouble();
        // 2.比较两只老虎的体重是否相等
        String result = weight1 == weight2 ? "两只老虎的体重相等" : "两只老虎的体重不相等";
        System.out.println(result);
    }
}
