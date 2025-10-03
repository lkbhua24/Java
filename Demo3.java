package com.lkbhua.ArrayDemo;

public class Demo3 {
    public static void main(String[] args) {
        /*  数组的遍历和练习
        * */
        int[] a = { 1, 2, 3, 4, 5 };
        for(int i = 0;i<5;i++) {
            System.out.println(a[i]);
        }

        // 在Java当中，关于数组的一个长度属性： length
        // 获取数组的长度：数组名.length
        System.out.println(a.length);
        for(int i = 0;i<a.length;i++) {
            System.out.println(a[i]);
        }

        // 扩展：
        // 自动的快速生成数组的遍历方式
        // idea提供
        // 数组名.fori
        // 如：a.fori

    }
}
