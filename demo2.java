package com.lkbhua.switchdemo;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        /*  ���󣺼���¼������������������պ���Ϣ��
        * */
        int day=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("��������������");
        day = sc.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("������");
                break;
            case 6:
            case 7:
                System.out.println("��Ϣ��");
                break;
            default:
                System.out.println("���������������");
        }
    }
}

/*
�����Լ�
switch (day){
case 1��2��3��4��5:
    System.out.println("������");
    break;
case 6��7:
    System.out.println("��Ϣ��");
    break;
default:
        System.out.println("���������������");
        break;
}
�����Լ�
switch (day){
case 1��2��3��4��5-> System.out.println("������");
case 6��7-> System.out.println("��Ϣ��");
default-> System.out.println("���������������");
}
* */