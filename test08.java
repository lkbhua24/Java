package com.lkbhua;

public class test08 {
    public static void main(String[] args) {
        /*  ���� �� ����
        * */
        int [] arr = {8,3,4,6};

        // 1.��ת
        for (int i = 0,j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


        // 2.���ڼ�����ͨ����10ȡ��ķ�ʽ����ȡ���
        // �����ڽ��ܵ�ʱ�����Ҫ�жϣ�0-4֮��+10��5-9֮�����ֲ���
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 0 && arr[i] <= 4){
                arr[i] = arr[i] + 10;
            }
        }


        // 3.ÿһλ��5
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] - 5;
        }

        // 4.��ȡÿһλ����
        int number = 0;
        for(int i = 0; i < arr.length; i++){
            number = number * 10 + arr[i];
        }
        System.out.println(number);

    }
}
