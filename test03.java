package com.lkbhua.operators.com.lkbhua;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        /*
        �������������������������һ��Ϊ6�����ս�����true
        ������ǵĺ�Ϊ6�ı��������ս�����true
        �����������false
        */
        // ������
        // 1.����������������
        // ����a   ����b

        // 2.a == 6 || b == 6 || a + b == 6
        // ����������е�һ�������true

        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ��������");
        int a = sc.nextInt();
        System.out.println("������ڶ���������");
        int b = sc.nextInt();
        boolean result = a == 6 || b == 6 || a + b == 6;
        System.out.println(result);

    }
}
