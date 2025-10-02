package com.lkbhua.ArrayDemo;

public class Demo1 {
    public static void main(String[] args) {
        /*  数组：数组的定义以及初始化
        * */
        // 数组定义简写格式
        // 数据类型[] 数组名 = {元素1,元素2,元素3,元素4,元素5};
        int[] arr1 = {1,2,3,4,5};

        // 完整格式
        // 数据类型[] 数组名 = new 数据类型[数组的长度]；
        int[] arr = new int[5];

        String [] arr2 = {"zhangsan","lisi","wangwu","zhaoliu","tianqi"};
        String [] arr3 = new String[5];

        System.out.println(arr1); // [I@10f87f48
        // 扩展：
        // 解释一下地址值的格式含义
        // [: 表示当前是一个数组
        // D: 数据类型为int
        // @: 表示一个间隔符号，（固定格式）
        // 10f87f48: 数组存储的起始地址
        // 习惯上我们会统称上面的完整格式为地址值
    }
}
