package com.lkbhua.Test;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        /*  �����ж�һ�����Ƿ�������
        *   ������ֻ�ܱ�1��������������
        * */
        // �жϣ�
        // дһ��ѭ������2��ʼ��һֱ�жϵ�num-1
        // �������Χ֮�ڣ���û�����ֿ��Ա�num����
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ�����֣�");
        int num = sc.nextInt();
        // ����һ��������ǣ����num�Ƿ�һ������
        boolean flag = true;
        for(int i = 2; i < num; i++){
            if(num%i==0){
                flag = false;
                // System.out.println("��������");
                break;
            }
        }
        // ֻ�е�ѭ�������ˣ���ʾ�����Χ֮�����е����ֶ�û�б�num��������ônum��������
        if(flag){
            System.out.println("������");
        }else{
            System.out.println("��������");
        }
    }
}
