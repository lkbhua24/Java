package com.lkbhua;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        /*  需求：在唱歌比赛中，6位评委进行打分，分数范围为【0-100】之间的整数。
            选手的最后得分是去掉一个最高分，一个最低分之后的平均值。
        * */
        // int []arr = {80,90,100,70,60,50};
        // System.out.println(printArray(arr));
        int []socre = new int[6];
        System.out.println("请输入评委的分数:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < socre.length; i++) {
            int score = sc.nextInt();
            socre[i] = score;
        }

        System.out.println("评委的分数是:");
        for (int i = 0; i < socre.length; i++) {
            System.out.print(socre[i] + " ");
        }

        System.out.println("平均分为：");
        System.out.println(printArray(socre));
    }
    public static int printArray(int[] socre){
        int max = socre[0];
        for (int i = 0; i < socre.length; i++) {
            if(socre[i]>max){
                max = socre[i];
            }
        }
        max = 0;

        int min = socre[0];
        for (int i = 0; i < socre.length; i++) {
            if(socre[i]<min){
                min = socre[i];
            }
        }
        min = 0;

        int sum = 0;
        for (int i = 0; i < socre.length; i++) {
            sum += socre[i];
        }

        return sum = sum / socre.length;

    }
}
