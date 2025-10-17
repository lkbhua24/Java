package com.lkbhua;

public class test04 {
    public static void main(String[] args) {
        /*  需求：把一个数组中的元素复制到另一个新数组中去
         * */
         // 分析：
         // 定义一个数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        // 2.定义一个新数组
        int[] newArr = new int[arr.length];

        // 3.遍历数组，把数组中的元素依次放到新数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // 4.输出新数组
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
