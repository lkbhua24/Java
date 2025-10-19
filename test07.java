package com.lkbhua;

public class test07 {
    public static void main(String[] args) {
        /*  需求： 把整数上的每一位都添加到数组当中
            整数： 123 12314，反正大于0
        * * */
        // 反向推导


        // 3.计算出数组的长度
        int number =12345;

        // 定义一个变量
        int count = 0;
        // 定义一个临时变量，存储原来的数字，以便后续使用
        int temp = number;
        while(number!=0){
            // 每一次循环去掉右边的一个数字
            number = number/10;
            System.out.println(number);
            // 去掉一次，计数器+1
            count++;
        }

        // 2.需要有一个数组
        // 动态初始化
        int[] arr = new int[count];

        // 1.把整数上的每一位都添加到数组当中
        int index = arr.length-1;
        while(temp!=0){
            // 获取temp中的每一位数字
            int ge = temp%10;
            // 把当前获得的个位添加到数组里面去
            arr[index] = ge;
            // 再去掉右边的数字
            temp = temp/10;
            index--;
        }

        // 4.验证数组
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
