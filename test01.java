package com.lkbhua.Test;

public class test01 {
    public static void main(String[] args) {
        /*  需求：逢7过
        *   当你要报的数字是7的倍数或者包含7的时候，就输出7过
        *   请你输出0-100之间的逢7过数字
        * */
        // 分析：
        // 出现7的情况有 个位是7，十位是7，百位是7 7的倍数
        // 7 14 21 28 35 42 49 56 63 70 77 84 91

        // 判断：
        // 个位是7：xxx%10==7？
        // 十位是7：xxx/10%10==7？
        // 百位是7：xxx/100%10==7？
        // 7的倍数：xxx%7==0？
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("7过");
                continue;
            }
            System.out.println(i);
        }
    }

}
