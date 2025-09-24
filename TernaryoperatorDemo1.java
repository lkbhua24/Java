package com.lkbhua.operators;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        // 需求：使用三元运算符，获取两个数中的最大值

        // 分析：
        // 1.定义两个变量记录两个整数
        int nun1 = 10;
        int nun2 = 20;

        // 2.使用三元运算符，获取两个数中的最大值
        // 格式： 关系表达式 ? 表达式1 : 表达式2
        // 注意： 整个三元运算符的结果必须要被使用
        int max = nun1 > nun2 ? nun1 : nun2;
        System.out.println(max);
        System.out.println(nun1 > nun2 ? nun1 : nun2);
    }
}
