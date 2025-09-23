package com.lkbhua.operators;

public class ArithmeticoperatorsDemo4 {
    public static void main(String[] args) {
        // +=
        // 规则：将左边和右边进行相加，将结果赋给左边变量
        int a = 10;
        int b = 5;
        // 把a+b，再把结果赋值给a
        a+=b;
        System.out.println(a);
        System.out.println(b);


        // 细节：
        // += -= *= /= %= 底层都隐藏了一个强制类型转换
        short c = 10;
        // 把左边和右边进行相加，得到结果2，再赋值给 c
        c+=1;
        // 等同于： c = (short)(c+1);
        System.out.println(c);
    }
}
