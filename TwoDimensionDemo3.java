package com.lkbhua;

public class TwoDimensionDemo3 {
    public static void main(String[] args) {
        /*   ����ĳ�̳�ÿ�����ȵ�Ӫҵ�����£���λ����Ԫ��
            ��һ���ȣ�22��66��44
            �ڶ����ȣ�77��33��88
            �������ȣ�25��45��65
            ���ļ��ȣ�11��66��99
            Ҫ������ÿ�����ȵ�Ӫҵ���������м���Ӫҵ��֮��
        * */
        int[][] yearArr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };

        // 1.�������м���Ӫҵ��֮��
        int yearSum = 0;

        // 2.������ά���飬��ȡÿ�����ȵ�Ӫҵ��
        for (int i = 0; i < yearArr.length; i++) {
            // ��ά�����е�ÿ��һά����
            int[] quarterArr = yearArr[i];
            int sum = getSum(quarterArr);
            System.out.println("��" + (i+1) + "���ȵ�Ӫҵ��Ϊ��" + sum);
            yearSum += sum;
        }
        System.out.println("���м���Ӫҵ��֮��Ϊ��" + yearSum);

    }
    // ����һ�������������ÿһ�����ȵ�Ӫҵ��
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
