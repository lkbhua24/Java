package com.lkbhua.Test;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args){
        /*  ���󣺼���¼��һ�����ڵ���2������x�����㲢����x��ƽ����
            ���ֻ�����������֣�С�����ֽ�����ȥ
        * */
        // ������
        // 10
        // 1*1=1<10;
        // 2*2=4<10;
        // 3*3=9<10;
        // 4*4=16>10;
        // �ƶϣ�10��ƽ������3-4֮��

        // �ڴ�����
        // ��1��ʼѭ�����������ֵ�ƽ����ԭ�������ֽ��бȽ�
        // ���С�ڵģ���ô���������ж�
        // �����ȣ���ô��ǰ���־���ƽ����
        // ������ڵģ���ôǰһ�����־���ƽ��������������
        System.out.println("������һ������:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            if(i * i == num){
                System.out.println(i+"����"+ num+"��ƽ����");
                break;
            }else if(i * i > num){
                System.out.println((i - 1)+"����"+ num+"��ƽ����");
                break;
            }
        }


    }
}
