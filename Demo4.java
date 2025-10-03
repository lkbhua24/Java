package com.lkbhua.ArrayDemo;

public class Demo4 {
    public static void main(String[] args) {
        /*  动态数组的定义与创建
            数据类型【】 数组名 = new 数据类型[数组的长度];
        * * */

        int[] arr = new int[5];
        String [] arr1 = new String[5];

        // 添加学生
        arr1[0] = "张三";
        arr1[1] = "王五";

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr[1]);
        // 数组默认初始化值的规律
        // 整数类型: 默认初始化值0
        // 小数类型: 默认初始化值0.0
        // 字符类型：默认初始化值\u0000
        // 布尔类型：默认初始化值false
        // 引用类型：默认初始化值null
    }
}
