package com.lkbhua;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        /*  �����ڳ�������У�6λ��ί���д�֣�������ΧΪ��0-100��֮���������
            ѡ�ֵ����÷���ȥ��һ����߷֣�һ����ͷ�֮���ƽ��ֵ��
        * */
        // int []arr = {80,90,100,70,60,50};
        // System.out.println(printArray(arr));
        int []socre = new int[6];
        System.out.println("��������ί�ķ���:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < socre.length; i++) {
            int score = sc.nextInt();
            socre[i] = score;
        }

        System.out.println("��ί�ķ�����:");
        for (int i = 0; i < socre.length; i++) {
            System.out.print(socre[i] + " ");
        }

        System.out.println("ƽ����Ϊ��");
        System.out.println(printArray(socre));
    }
    public static int printArray(int[] socre){
        int max = socre[0];
        for (int i = 0; i < socre.length; i++) {
            if(socre[i]>max){
                max = socre[i];
            }
        }
        max = 0;

        int min = socre[0];
        for (int i = 0; i < socre.length; i++) {
            if(socre[i]<min){
                min = socre[i];
            }
        }
        min = 0;

        int sum = 0;
        for (int i = 0; i < socre.length; i++) {
            sum += socre[i];
        }

        return sum = sum / socre.length;

    }
}
