package com.lkbhua.switchdemo;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        /*  ������1-7�����֣�����������Ӧ������
        * */
        int week = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("������1-7�����֣�");
        week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("����һ");
                break;
            case 2:
                System.out.println("���ڶ�");
                break;
            case 3:
                System.out.println("������");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("������");
                break;
            case 6:
                System.out.println("������");
                break;
            case 7:
                System.out.println("������");
                break;
            default:
                System.out.println("�������������");
                break;
        }
    }
}
// switch��֪ʶ��
/*
    default��λ�ú�ʡ��
    1.λ�ã�default��λ�ò�һ����Ҫ�����棬ֻ��ϰ��д��������
    2.ʡ�ԣ�default����ʡ�ԣ����ǲ����飬�﷨Ҳ����������

    case��͸
    1.���û�з���case�к���break����ô������������ִ�У�ֱ��������һ��break����case����default
    2.���Ȼ��ǻ����С��ŵ�ʼ��ֵ�ҵ���Ӧ��������ȥswitchִ�С�

    switch������
    ���ϵ�д�������Լ�д
    ע�⣺ֻ�е�caseִ�е��������ֻ��һ��ʱ�ſ���ʡ��
    Ҳ���԰�switch��ֵ��ֵҲһ�������������ὲ�⣩
    switch (week) {
        case 1-> System.out.println("����һ");
        case 2-> System.out.println("���ڶ�");
        ------
        case 7-> System.out.println("������");
        default -> System.out.println("�������������");
    }

    switch��if���Ե�ʹ�ó���
    switch�������޸�������һһ�оٳ�����������ѡ����һ���в���
    if���ж�һ�����������������ִ�У�����ִ�У�һ����һ����Χ���жϣ�
* */
