package com.lkbhua.operators.com.lkbhua;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args){
        /* ���󣺶���԰����ֻ�ϻ������طֱ�ͨ������¼��
        �������ó���������ж�����ֻ�ϻ��������Ƿ����
        * */

        // ������
        // 1.����¼����ֻ�ϻ�������
        System.out.println("�������һֻ�ϻ������أ�");
        Scanner sc = new Scanner(System.in);
        double weight1 = sc.nextDouble();
        System.out.println("������ڶ�ֻ�ϻ������أ�");
        double weight2 = sc.nextDouble();
        // 2.�Ƚ���ֻ�ϻ��������Ƿ����
        String result = weight1 == weight2 ? "��ֻ�ϻ����������" : "��ֻ�ϻ������ز����";
        System.out.println(result);
    }
}
