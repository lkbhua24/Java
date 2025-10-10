package com.lkbhua.MethodDemo1;

public class demo2 {
    public static void main(String[] args) {
        /*  需求：掌握带参数方法定义和调用
        *   定义一个方法，求长方形的周长，将结果在方法中打印
        * */
        getPerimeter(5,10);
    }
    public static void getPerimeter(double a,double b){
        double perimeter = 2*(a+b);
        System.out.println(perimeter);
    }

}
