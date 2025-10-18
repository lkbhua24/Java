package com.lkbhua;

public class test06 {
    public static void main(String[] args) {
        /*  需求：某系统的数组密码（大于0），比如1983，采用加密方式进行传输
        规则如下： 先得到每位数，然后每位数都加上5，再对10取余，最后将每位数进行反转，得到一串新数
        * */
        // 分析：
        // 1.把整数里面的每一位放到数组当中
        int []arr = {1,9,8,3};

        // 2.加密
        // ①每一位加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=5;
        }

        // ②对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i]%=10;
        }

        // ③反转
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


        // 3，把数组里面的每一个数字进行拼接，变成加密之后的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
            System.out.print(number);
        }



    }
}
