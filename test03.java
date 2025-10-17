package com.lkbhua;

import java.util.Random;

public class test03 {
    public static void main(String[] args) {
        /*  需求：定义方法实现随机产生一个5位的验证码
           验证码格式：
           1. 长度为5
           2. 前四位是大写字母或小写字母
           3. 最后一位是数字
        * */
        // 分析：
        // A-Z a-z
        // 在以后如果我们要在一堆没有什么规律的数据中随机抽取
        // 可以先把这些数据放到数组当中
        // 再随机抽取一个索引

        // 1.大小字母和小写字母都放到数组当中
        // 难点：如何把大小写字母放到数组当中
        char [] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            // ASCII码表
            if(i<=25){
                // 添加小写字母
                chs[i]=(char)(97+i); //97在ascii码表中是a的ASCII码，所以97+i就是a+i

            }
            else{
                // 添加大写字母
                chs[i]=(char)(65+i-26); //65在ascii码表中是A的ASCII码，所以65+i-26就是A+i
            }
        }
        // 定义一个字符串类型的变量，保存随机生成的字符
        String str = "";

        // 2.随机抽取索引四次
        Random r = new Random();
        // 0-51
        // 利用随机索引获取字符
        for(int i = 0; i < 4; i++){
            int randomIndex = r.nextInt(chs.length);
            str = str += chs[randomIndex];
        }

        // 3.随机抽取一个数字
        int num = r.nextInt(10);
        str = str + num;

        // 4.拼接字符串
        System.out.println(str);
    }
}
