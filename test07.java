package com.lkbhua;

public class test07 {
    public static void main(String[] args) {
        /*  ���� �������ϵ�ÿһλ����ӵ����鵱��
            ������ 123 12314����������0
        * * */
        // �����Ƶ�


        // 3.���������ĳ���
        int number =12345;

        // ����һ������
        int count = 0;
        // ����һ����ʱ�������洢ԭ�������֣��Ա����ʹ��
        int temp = number;
        while(number!=0){
            // ÿһ��ѭ��ȥ���ұߵ�һ������
            number = number/10;
            System.out.println(number);
            // ȥ��һ�Σ�������+1
            count++;
        }

        // 2.��Ҫ��һ������
        // ��̬��ʼ��
        int[] arr = new int[count];

        // 1.�������ϵ�ÿһλ����ӵ����鵱��
        int index = arr.length-1;
        while(temp!=0){
            // ��ȡtemp�е�ÿһλ����
            int ge = temp%10;
            // �ѵ�ǰ��õĸ�λ��ӵ���������ȥ
            arr[index] = ge;
            // ��ȥ���ұߵ�����
            temp = temp/10;
            index--;
        }

        // 4.��֤����
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
