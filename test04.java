package com.lkbhua.Test;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args){
        /*  ���󣺸���һ������
        ���x��һ�������������򷵻�true�����򷵻�false
          ��������������121 ������Ҳ��121
        * */

        // ����˼·�������ֵ�������Դ���ֱȽ�
        System.out.println("������һ������:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // ����һ����ʱ�������ڼ�¼xԭ����ֵ�����������бȽ�
        int temp = x;

        // ����һ���������ڼ�¼����������
        int num = 0;

        // ����ѭ����ȡÿһλ
        while (x!=0){
            // ���������ȡ
            int ge = x % 10;
            // �޸�һ��x��¼��ֵ
            x = x / 10;
            // ƴ������
            num = num * 10 + ge;
        }

        // �ж�
        if(temp == num){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
