package com.lkbhua.Test;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        /*  �����̳Ƕ�����vip��Ա�ƶȣ�������ƷΪ1000Ԫ
        ����¼���Ա���𣬲������ʵ��֧����Ǯ
        ��Ա1������9��
        ��Ա2������8��
        ��Ա3������7��
        �ǻ�Ա��������
        * */
        int price = 1000;
        System.out.println("�������Ա����");
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();
        if(level == 1)
        {
            System.out.println("��Ա1������9�ۣ�ʵ��֧����" + price * 0.9);
        }
        else if(level == 2)
        {
            System.out.println("��Ա2������8�ۣ�ʵ��֧����" + price * 0.8);
        }
        else if(level == 3)
        {
            System.out.println("��Ա3������7�ۣ�ʵ��֧����" + price * 0.7);
        }
        else
        {
            System.out.println("�ǻ�Ա�������ۣ�ʵ��֧����" + price);
        }
        System.out.println("��ӭ�´ι���");
    }
}
