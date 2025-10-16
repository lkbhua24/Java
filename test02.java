package com.lkbhua;

public class test02 {
    public static void main(String[] args) {
        /*  需求：判断101-200之间有多少个素数，并输出所有素数
            素数：只能被1和自身整除的数
        * */
        // 循环嵌套
        // 思路一：
        // 1. 遍历101-200
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            // 2. 判断素数
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    // 跳出内循环，执行下面代码
                    break;
                }
                if (flag) {
                    System.out.println("当前数字" + i + "是素数");
                    count++;
                }
            }
        }
    }
}
