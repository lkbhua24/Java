package com.lkbhua.Test;

public class Arraytest03 {
    public static void main(String[] args) {
        /*  需求：定义一个数组，存储1-10的数据，并遍历。
            要求：
            1.如果是奇数，则*到原来的两倍
            2.如果是偶数，则/2
        * */
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("扩展前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if((arr[i]%2)==1){
                arr[i] = arr[i]*2;
            }
            else{
                arr[i] = arr[i]/2;
            }
        }
        System.out.println("扩展后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
