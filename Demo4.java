package com.lkbhua.ArrayDemo;

public class Demo4 {
    public static void main(String[] args) {
        /*  ��̬����Ķ����봴��
            �������͡��� ������ = new ��������[����ĳ���];
        * * */

        int[] arr = new int[5];
        String [] arr1 = new String[5];

        // ���ѧ��
        arr1[0] = "����";
        arr1[1] = "����";

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr[1]);
        // ����Ĭ�ϳ�ʼ��ֵ�Ĺ���
        // ��������: Ĭ�ϳ�ʼ��ֵ0
        // С������: Ĭ�ϳ�ʼ��ֵ0.0
        // �ַ����ͣ�Ĭ�ϳ�ʼ��ֵ\u0000
        // �������ͣ�Ĭ�ϳ�ʼ��ֵfalse
        // �������ͣ�Ĭ�ϳ�ʼ��ֵnull
    }
}
