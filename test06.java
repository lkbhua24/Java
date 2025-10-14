package com.lkbhua.Test;

public class test06 {
    public static void main(String[] args) {
        /*  需求：定义一个方法，用以求数组的最大值
        * */
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int max = getMax(arr);
        System.out.println(max);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
