package com.lkbhua.operators.com.lkbhua;

public class test05 {
    public static void main(String[] args){
        /* 需求：三个和尚比身高，已知他们的身高为150，210，180，
        求出最高的和尚身高
        * */

        // 1.定义三个变量记录三个身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 180;

        // 2。拿着第一个和尚的身高跟第二个和尚的身高进行比较
        // 再拿着他们相比较的结果跟第三个和尚的身高进行比较
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        System.out.println(max);
        // ctrl + alt + l 自动格式化代码
    }
}
