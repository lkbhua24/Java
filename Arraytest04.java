package com.lkbhua.Test;

public class Arraytest04 {
    public static void main(String[] args) {
        /*  ��������ֵ
        * */
        int [] arr = {10,20,30,40,50};

        // ������ֵ������ĵ�һ��Ԫ��
        int Max = arr[0];

        // �������飬�õ�������ÿ��Ԫ��
        for (int i = 0; i < arr.length; i++) {
            // �жϵ�ǰԪ���Ƿ��Max��
            if(arr[i]> Max){
                Max = arr[i];
            }
        }
        System.out.println("?Max="+Max);
    }
}
