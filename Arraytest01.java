package com.lkbhua.Test;

public class Arraytest01 {
    public static void main(String[] args){
        /*  ���󣺶���һ�����飬�洢1��2��3��4��5
            ��������õ�ÿһ��Ԫ�أ��������������е������
        * */
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.println(sum);
        }
    }
}
