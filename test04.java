package com.lkbhua.Test;

public class test04 {
    public static void main(String[] args){
        /*  需求： 使用方法重载的思想，设计比较两个整数是否相同的方法
         *        兼容全整数类型（byte、short、int、long）
        * */
		// 允许重载的条件:
		// 方法名必须相同。
		// 参数列表(数量、类型、顺序)必须不同。
		// 返回值类型、访问修饰符、异常声明等可以不同，但不是重载的必要条件。
     compare(5,5);
     compare(5L,5);
     compare((byte) 10,(byte) 10);
     compare((short) 10,(short) 10);


    }
    public static boolean compare(byte a,byte b){
        return a==b;
    }
    public static boolean compare(short a,short b){
        return a==b;
    }
    public static boolean compare(int a,int b){
        return a==b;
    }
    public static boolean compare(long a,long b){
        return a==b;
    }
}
