package com.lkbhua.Test;

public class test05 {
    public static void main(String[] args) {
        /*  ���� ����һ�������������������Ҫ������Ľ������һ���ϵġ�
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
