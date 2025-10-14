package com.lkbhua.Test;

public class test05 {
    public static void main(String[] args) {
        /*  需求： 定义一个方法用于数组遍历，要求遍历的结果是在一行上的。
        * */
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
