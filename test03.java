package com.lkbhua.Test;

public class test03 {
    public static void main(String[] args){
        /*  ���󣺶���һ�������󳤷��ε���������ұȽ����������εĴ�С
        * */
        double area1 = getArea(5.0,8.0);
        double area2 = getArea(3.0,4.0);
        if(area1 > area2){
            System.out.println("��һ�������");
        }else{
            System.out.println("�ڶ��������");
        }

    }
    public static double getArea(double length,double width){
        double area = length * width;
        System.out.println("����ǣ�" + area);
        return area;
    }

}
