package com.lkbhua.Test;

import java.util.Random;
import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        /*  ���󣺲�������Ϸ��0-100
        * */
        Random r = new Random();
        // С��������0-99����ͷ����β
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("��������Ҫ�µ����֣�");
        int num = sc.nextInt();
        while (true) {
            if (num > number) {
                System.out.println("��µ�����̫����");
            }
            else if (num< number) {
                System.out.println("��µ�����̫С��");
            }
            else{
                System.out.println("��ϲ��¶���");
                break;
            }
        }

    }
}
