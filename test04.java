package com.lkbhua.Test;

public class test04 {
    public static void main(String[] args){
        /*  ���� ʹ�÷������ص�˼�룬��ƱȽ����������Ƿ���ͬ�ķ���
         *        ����ȫ�������ͣ�byte��short��int��long��
        * */
		// �������ص�����:
		// ������������ͬ��
		// �����б�(���������͡�˳��)���벻ͬ��
		// ����ֵ���͡��������η����쳣�����ȿ��Բ�ͬ�����������صı�Ҫ������
     compare(5,5);
     compare(5L,5);
     compare((byte) 10,(byte) 10);
     compare((short) 10,(short) 10);


    }
    public static boolean compare(byte a,byte b){
        return a==b;
    }
    public static boolean compare(short a,short b){
        return a==b;
    }
    public static boolean compare(int a,int b){
        return a==b;
    }
    public static boolean compare(long a,long b){
        return a==b;
    }
}
