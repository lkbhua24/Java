package com.lkbhua;

public class TwoDimensionDemo2 {
    public static void main(String[] args) {
        /*  ���󣺴�����ά���飬������
          *  ��ά���飺��̬��ά
        * */

        // 1.���ö�̬��ʼ����ʽ������ά����
        // 3����ʾ��ά���������Ϊ3������װ3��һά����
        // 5����ʾÿ��һά���������Ϊ5��5��Ԫ��
        int[][] arr = new int[3][5];

        // 2.����ά���鸳ֵ
        arr[0][0] = 1;

        // 3.������ά����
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
