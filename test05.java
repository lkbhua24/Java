package com.lkbhua.Test;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args){
        /*  ���� ���������������������ͳ����������������Ҳ�����int�ķ�Χ��
            �����������Ҫ��ʹ�ó˷���������ȡ�����㣬�������̺�������
        * */
        // ˼·�������ı��ʾ��Ǽ������������ж��ٴο��Ա���������ı�

        // ��ʾ�û�����������
        System.out.println("�����뱻�����ͳ���:");

        // ��ȡ�û�����
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        // ����ѭ����������߼�
        while(a>=b){
            a = a-b;
            count++;
        }
        // ������
        System.out.println("��Ϊ��"+count);
        System.out.println("����Ϊ��"+a);
    }
}
