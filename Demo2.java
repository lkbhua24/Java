package com.lkbhua.ArrayDemo;

public class Demo2 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a[5]);

        a[0] = 100;
        System.out.println(a[0]);
        // 一旦赋值之后，原来的数值将被内存销毁！
    }
}
