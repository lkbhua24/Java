package com.lkbhua.Test;

import java.util.Random;

public class Arraytest07 {
    public static void main(String[] args) {
        /*  ���󣺴��������е�����
        * */

        // ������
        // ֻ��Ҫ����һ����Ԫ�ظ�����������н���
        // �ؼ��㣺��λ�ȡ�������
        int [] arr = {10,20,30,40,50};

        // ������Χ��[0,4]
        Random r = new Random();
        int randomIndex = r.nextInt(arr.length);
        int temp = arr[0];

        System.out.println("����ǰ:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        System.out.println("������:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
