package com.lkbhua.Test;

import java.util.Random;

public class Arraytest07 {
    public static void main(String[] args) {
        /*  需求：打乱数组中的数据
        * */

        // 分析：
        // 只需要拿着一个首元素跟随机索引进行交换
        // 关键点：如何获取随机索引
        int [] arr = {10,20,30,40,50};

        // 索引范围：[0,4]
        Random r = new Random();
        int randomIndex = r.nextInt(arr.length);
        int temp = arr[0];

        System.out.println("交换前:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        System.out.println("交换后:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
