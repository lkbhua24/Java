package com.lkbhua.Test;

import java.util.Random;
import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        /*  需求：猜数字游戏：0-100
        * */
        Random r = new Random();
        // 小括号内是0-99，包头不包尾
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要猜的数字：");
        int num = sc.nextInt();
        while (true) {
            if (num > number) {
                System.out.println("你猜的数字太大了");
            }
            else if (num< number) {
                System.out.println("你猜的数字太小了");
            }
            else{
                System.out.println("恭喜你猜对了");
                break;
            }
        }

    }
}
