package com.lkbhua.Test;

public class test03 {
    public static void main(String[] args){
        /*  需求：定义一个方法求长方形的面积，并且比较两个长方形的大小
        * */
        double area1 = getArea(5.0,8.0);
        double area2 = getArea(3.0,4.0);
        if(area1 > area2){
            System.out.println("第一个面积大");
        }else{
            System.out.println("第二个面积大");
        }

    }
    public static double getArea(double length,double width){
        double area = length * width;
        System.out.println("面积是：" + area);
        return area;
    }

}
