package com.lkbhua.Test;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args){
        /*  ��������һ�����䡣
        �ж��Ƕ�ͯ�������껹�����껹�����껹�����껹������
        ��ͯ��0-11��
        ���꣨12-17��
        ���꣨18-30��
        ���꣨31-50��
        ���꣨51-70��
        * */
        System.out.println("���������䣺");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=0 && age<=11){
            System.out.println("��ͯ");
        }
        else if(age>=12 && age<=17){
            System.out.println("����");
        }
        else if(age>=18 && age<=30){
            System.out.println("����");
        }
        else if(age>=31 && age<=50){
            System.out.println("����");
        }
        else if(age>=51 && age<=70){
            System.out.println("����");
        }
        else{
            System.out.println("����");
        }
    }
}
