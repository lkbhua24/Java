package com.lkbhua;

public class test08 {
    public static void main(String[] args) {
        /*  需求 ： 解密
        * */
        int [] arr = {8,3,4,6};

        // 1.反转
        for (int i = 0,j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


        // 2.由于加密是通过对10取余的方式进行取余的
        // 所以在解密的时候就需要判断，0-4之间+10，5-9之间数字不变
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 0 && arr[i] <= 4){
                arr[i] = arr[i] + 10;
            }
        }


        // 3.每一位减5
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] - 5;
        }

        // 4.获取每一位数字
        int number = 0;
        for(int i = 0; i < arr.length; i++){
            number = number * 10 + arr[i];
        }
        System.out.println(number);

    }
}
