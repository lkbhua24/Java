package com.lkbhua;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        /*  ���󣺻�Ʊ�۸��յ���������ͷ�Ȳպ;����շѡ������Ʊԭ�ۡ��·ݺ�ͷ�Ȳջ򾭼ò�
         *        �������¹�������Ʊ�۸�������5-10�£� ͷ�Ȳ�9�� ���ò�8.5�ۣ�������11-4�£� ͷ�Ȳ�7�� ���ò�6.5��
         * */
        // 1.����¼���Ʊԭ�ۡ��·ݺ�ͷ�Ȳջ򾭼ò�
        Scanner sc = new Scanner(System.in);
        System.out.println("�������Ʊԭ�ۣ�");
        double price = sc.nextDouble();

        System.out.println("�������·ݣ�");
        int month = sc.nextInt();

        System.out.println("������ͷ�Ȳջ򾭼òգ�");
        String type = sc.next();

        double price1 = getPrice(price,month,type);
        System.out.println("��Ʊ�۸�" + price1);

    }
    public static double getPrice(double price,int month,String type) {
        // 2.�ж��·��Ƿ�������
        if (month >= 5 && month <= 10) {
            if (type.equals("ͷ�Ȳ�")) {
                price *= 0.9;
            }
            if (type.equals("���ò�")) {
                price *= 0.85;
            }
        }
        if (month >= 11 || month <= 4) {
            if (type.equals("ͷ�Ȳ�")) {
                price *= 0.7;
            }
            if (type.equals("���ò�")) {
                price *= 0.65;
            }
        }
        return price;

    }
}

// ctrl+alt+M���Զ���ȡ����



