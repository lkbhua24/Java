package com.lkbhua.operators;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        // 1.&&逻辑与
        // 俩边都为真，结果才是真
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // 2.||逻辑或
        // 俩边有一个为真，结果就是真
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // 3.!逻辑非
        // 输入为真，结果为假
        // 取反感叹号不要写多次，要么不写，要么只写一次
        System.out.println(!true);
        System.out.println(!false);

        // 4.^逻辑异或
        // 俩边不同为真，结果就是真
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false^false);

    }
}
