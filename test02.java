package com.lkbhua.operators.com.lkbhua;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args){
        /* ����:
        ��������Լ���������ͼ�ڲ�����һ�����ӳԷ�
        ����¼��������������ʾ������Լ�������·�ʱ�̶ֳȣ��ֶ�¼��0-10��������������������
        ������ʱ�̶ֳȴ������Լ������ʱ�̶ֳȣ������׳ɹ����true
        �������false
        * */

        // 1������¼������������ʾ�·�ʱ�̶ֳ�
        Scanner sc = new Scanner(System.in);
        System.out.println("���������ʱ�̶ֳȣ�");
        int myLevel = sc.nextInt();
        System.out.println("���������Լ������ʱ�̶ֳȣ�");
        int yourLevel = sc.nextInt();

        // 2.�����·���ʱ�̶ֳȸ�Ů����ʱ�̶ֳȽ��бȽ�
        boolean result = myLevel > yourLevel;

        // 3.��ӡ���
        System.out.println(result);
    }

}
