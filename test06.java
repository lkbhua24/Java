package com.lkbhua;

public class test06 {
    public static void main(String[] args) {
        /*  ����ĳϵͳ���������루����0��������1983�����ü��ܷ�ʽ���д���
        �������£� �ȵõ�ÿλ����Ȼ��ÿλ��������5���ٶ�10ȡ�࣬���ÿλ�����з�ת���õ�һ������
        * */
        // ������
        // 1.�����������ÿһλ�ŵ����鵱��
        int []arr = {1,9,8,3};

        // 2.����
        // ��ÿһλ����5
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=5;
        }

        // �ڶ�10ȡ��
        for (int i = 0; i < arr.length; i++) {
            arr[i]%=10;
        }

        // �۷�ת
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


        // 3�������������ÿһ�����ֽ���ƴ�ӣ���ɼ���֮��Ľ��
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
            System.out.print(number);
        }



    }
}
