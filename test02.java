package com.lkbhua;

public class test02 {
    public static void main(String[] args) {
        /*  �����ж�101-200֮���ж��ٸ��������������������
            ������ֻ�ܱ�1��������������
        * */
        // ѭ��Ƕ��
        // ˼·һ��
        // 1. ����101-200
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            // 2. �ж�����
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    // ������ѭ����ִ���������
                    break;
                }
                if (flag) {
                    System.out.println("��ǰ����" + i + "������");
                    count++;
                }
            }
        }
    }
}
