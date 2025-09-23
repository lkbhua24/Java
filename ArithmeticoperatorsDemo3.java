package com.lkbhua.operators;

public class ArithmeticoperatorsDemo3 {
    public static void main(String[] args)
    {
        // ++ --
        int a = 10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);
        int x = 10;
        // 后++：先用后加
        // 先把x变量赋给y变量，再加1
        // 赋值给y的值是自增前的
        int y = x++;
        // 先++：先加后用
        // 先加1，再赋值给z变量
        int z = ++x;
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("z:"+z);

    }
}
