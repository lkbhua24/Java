package com.lkbhua.loopdemo;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        /* ���󣺼���¼���������֣���ʾһ����Χ
        �������Χ�ܱ������������ܱ��������������ж��ٸ��������
        * */

        // ������
        // 1������¼����������
        Scanner sc = new Scanner(System.in);
        System.out.println("¼���������ֱ�ʾ��Χ��");
        System.out.println("�������������֣�");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;

        // 2.����ѭ����ȡ�����Χ��ÿһ������
        for(int i = start; i <= end; i++)
        {
            // 3.�ж���������Ƿ���������
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i);
                count++;
            }
        }
    }
}
