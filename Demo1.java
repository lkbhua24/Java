package com.lkbhua.ArrayDemo;

public class Demo1 {
    public static void main(String[] args) {
        /*  ���飺����Ķ����Լ���ʼ��
        * */
        // ���鶨���д��ʽ
        // ��������[] ������ = {Ԫ��1,Ԫ��2,Ԫ��3,Ԫ��4,Ԫ��5};
        int[] arr1 = {1,2,3,4,5};

        // ������ʽ
        // ��������[] ������ = new ��������[����ĳ���]��
        int[] arr = new int[5];

        String [] arr2 = {"zhangsan","lisi","wangwu","zhaoliu","tianqi"};
        String [] arr3 = new String[5];

        System.out.println(arr1); // [I@10f87f48
        // ��չ��
        // ����һ�µ�ֵַ�ĸ�ʽ����
        // [: ��ʾ��ǰ��һ������
        // D: ��������Ϊint
        // @: ��ʾһ��������ţ����̶���ʽ��
        // 10f87f48: ����洢����ʼ��ַ
        // ϰ�������ǻ�ͳ�������������ʽΪ��ֵַ
    }
}
