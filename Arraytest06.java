package com.lkbhua.Test;

public class Arraytest06 {
    public static void main(String[] args) {
        /*  ���󣺶���һ�����飬����1��2��3��4��5���������󽻻�������Ӧ��Ԫ��
         *  ����ǰ��1,2,3,4,5
         *  ������5,2,3,4,1
        * */
        int [] arr = {1,2,3,4,5};
        System.out.println("����ǰ��");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("������");

        // ����һ����ʱ����temp����ɽ���Ԫ�ص�λ��
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // println()ȥ�����з���print()
        }
        System.out.println();

    }
}
