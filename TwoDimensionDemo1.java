package com.lkbhua;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        /*  ��λ����֪ʶ��
        * */

        // 1.��λ����ľ�̬��ʼ��
        // ��������[][] ������ = {{Ԫ��1,Ԫ��2},{Ԫ��3,Ԫ��4}};
        int[][] arr1 = {{1,2},{3,4}};
        int[][] arr2 = new int[][]{{1,2,3},{4,5,6}};

        // ������ַ�ʽ��д
        int[][] arr3 = {{1,2,3},
                        {4,5,6}};

        // 2.��ȡԪ��
        // arr[i][j];
        // arr:��ά����
        // i:������
        // j:������
        System.out.println(arr3[0]); //[I@10f87f48 ����ʾ��ȡ��λ�����еĵ�һ������
        System.out.println(arr3[0][0]);
        System.out.println(arr3[0][1]);
        System.out.println(arr3[0][2]);
        System.out.println(arr3[1][0]);
        System.out.println(arr3[1][1]);
        System.out.println(arr3[1][2]);


        // 3.��ά����ı���
        // ��ѭ����������ά�����е�ÿһ��
        for (int i = 0; i < arr3.length; i++) {
            // ��ѭ����������ά�����е�ÿһ���е�ÿһ��Ԫ��
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j]+"\t");
            }
        }
    }
}
