package com.lkbhua.loopdemo;

public class demo1 {
    public static void main(String[] args){
        /*  ������1-5֮��ĺ�
        * */
        int sum = 0;
        for(int i=0;i<5;i++){
            // int sum = 0;
            // ��չС�㣺
            // 1. ��͵ı������ܶ�����ѭ�����棬��Ϊ�������������ܳ���ѭ��
            // 2. ������ǰѱ���������ѭ�����棬��ô��ǰ����ֻ���ڱ���ѭ������Ч
            // ������ѭ������֮��sum�����ͻ����٣��´�ѭ����ʱ��sum�����ͻ����´���
            sum += i;
            System.out.println("sum="+sum);
        }
    }
}
