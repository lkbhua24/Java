package com.lkbhua.Test;

import java.util.Random;

public class Arraytest05 {
    public static void main(String[] args) {
        /*  ��������10��1-100֮������֣����ŵ�������
          * 1> ����������ݵĺ�
          * 2> �ҳ��������ݵ�ƽ����
          * 3> ͳ���ж��ٸ����ݱ�ƽ����С
        * */

        // ������
        // 1.����һ������
        // ��̬��ʼ�������ֻ�δ֪��
        int [] arr = new int[10];

        // 2.����10��1-100֮�������
        Random r = new Random();
        for(int i = 0; i < arr.length; i++){
            // ÿѭ��һ�Σ��ͻ�����һ���µ������
            int num = r.nextInt(100)+1;
            arr[i] = num;
        }


        // 3.���
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("��Ϊ��"+sum);

        // 4.��ƽ����
        double avg = (double)sum / arr.length;
        System.out.println("ƽ����Ϊ��"+avg);

        // 5.ͳ���ж��ٸ����ݱ�ƽ����С
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < avg){
                count++;
                System.out.println(arr[i]);
            }
        }
        System.out.println("��"+count+"�����ݱ�ƽ����С");


        // �������飨��֤�𰸣�
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("==================");



    }
}
