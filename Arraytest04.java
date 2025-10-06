package com.lkbhua.Test;

public class Arraytest04 {
    public static void main(String[] args) {
        /*  需求：求最值
        * */
        int [] arr = {10,20,30,40,50};

        // 假设最值是数组的第一个元素
        int Max = arr[0];

        // 遍历数组，得到数组中每个元素
        for (int i = 0; i < arr.length; i++) {
            // 判断当前元素是否比Max大
            if(arr[i]> Max){
                Max = arr[i];
            }
        }
        System.out.println("?Max="+Max);
    }
}
