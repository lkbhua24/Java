package com.lkbhua.operators;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        // ����ʹ����Ԫ���������ȡ�������е����ֵ

        // ������
        // 1.��������������¼��������
        int nun1 = 10;
        int nun2 = 20;

        // 2.ʹ����Ԫ���������ȡ�������е����ֵ
        // ��ʽ�� ��ϵ���ʽ ? ���ʽ1 : ���ʽ2
        // ע�⣺ ������Ԫ������Ľ������Ҫ��ʹ��
        int max = nun1 > nun2 ? nun1 : nun2;
        System.out.println(max);
        System.out.println(nun1 > nun2 ? nun1 : nun2);
    }
}
