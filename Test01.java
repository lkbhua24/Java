package com.lkbhua.test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        /* ���󣺼���¼��һ����������ʾ���ϵ�Ǯ
        ������ڵ���100�����Գ��������
        ���С��100�����Գ�ɳ��С��
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ǯ����");
        int money = sc.nextInt();
        if(money>=100){
            System.out.println("���������");

        }
        else{
            System.out.println("��ɳ��С��");

        }
    }
}
