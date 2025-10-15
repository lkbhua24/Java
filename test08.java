package com.lkbhua.Test;

public class test08 {
    public static void main(String[] args) {
        /*    需求：定义一个方法copyOfRange(int[] arr,int start,int end)，
        *      功能：将指定数组arr中，start开始，end结束的元素拷贝到一个新的数组中，并返回该数组
        * */
        // 1.定义一个原始数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // 2。调用方法拷贝数据
        int [] copyArr = copyOfRange(arr,3,7);

        // 3.打印新数组
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i]+" ");
        }
    }
    public static int[] copyOfRange(int[] arr,int start,int end) {
        // 1.定义一个新数组
        // 不知道所有的元素，用动态数组
        int [] newArr = new int[end-start];

        // 伪造索引思想
        int index = 0;
        // 2.把原始数组中的数据拷贝到新数组中
        for (int i = start; i < end; i++) {
            // 格式：newArr[i-start] = arr[i];
            newArr[index] = arr[i];
            index++;
        }
        // 3.返回新数组
        return newArr;
    }
}
