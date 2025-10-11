package com.lkbhua.Test;

public class test02 {
    public static void main(String[] args) {
        /*  需求：求利用方法一个圆的面积，并进行打印
        * */
        getArea(5.0);
    }

    public static void getArea(double radius){
        double area = 3.14 * radius * radius;
        System.out.println(area);
    }
}
