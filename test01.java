package com.lkbhua.Test;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args){
        /* ����һ������Ʊ�ţ������ż��Ʊ�����������λ
        * ����Ʊ�������ұ���λ
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ������Ʊ�ţ�");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("�������λ");
        }
        else {
            System.out.println("���ұ���λ");
        }

    }
}
