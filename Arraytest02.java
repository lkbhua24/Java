package com.lkbhua.Test;

public class Arraytest02 {
    public static void main(String[] args) {
        /*  ���󣺶���һ�����飬�洢1-10
            ��������õ�ÿһλԪ�أ�ͳ����������һ���ж��ٸ��ܱ�3����������
        * */
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i]%3)==0) {
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("����"+count+"���ܱ�3����������");
    }
}
