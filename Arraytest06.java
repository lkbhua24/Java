package com.lkbhua.Test;

public class Arraytest06 {
    public static void main(String[] args) {
        /*  需求：定义一个数组，存入1，2，3，4，5。按照需求交换索引对应的元素
         *  交换前：1,2,3,4,5
         *  交换后：5,2,3,4,1
        * */
        int [] arr = {1,2,3,4,5};
        System.out.println("交换前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("交换后：");

        // 借助一个临时变量temp，完成交换元素的位置
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // println()去掉换行符：print()
        }
        System.out.println();

    }
}
