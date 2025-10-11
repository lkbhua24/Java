package com.lkbhua.Test;

public class test01 {
    public static void main(String[] args) {
        /*  需求：定义一个方法，在方法内部定义两个变量
                求出他们的和并进行打印
        * */
        add(10,20);
    }

    public static void add(int a,int b)
    {
        int sum = a+b;
        System.out.println(sum);
    }
}
