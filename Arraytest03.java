package com.lkbhua.Test;

public class Arraytest03 {
    public static void main(String[] args) {
        /*  ���󣺶���һ�����飬�洢1-10�����ݣ���������
            Ҫ��
            1.�������������*��ԭ��������
            2.�����ż������/2
        * */
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("��չǰ��");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if((arr[i]%2)==1){
                arr[i] = arr[i]*2;
            }
            else{
                arr[i] = arr[i]/2;
            }
        }
        System.out.println("��չ��");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
