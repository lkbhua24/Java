package com.lkbhua.Test;

public class test08 {
    public static void main(String[] args) {
        /*    ���󣺶���һ������copyOfRange(int[] arr,int start,int end)��
        *      ���ܣ���ָ������arr�У�start��ʼ��end������Ԫ�ؿ�����һ���µ������У������ظ�����
        * */
        // 1.����һ��ԭʼ����
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // 2�����÷�����������
        int [] copyArr = copyOfRange(arr,3,7);

        // 3.��ӡ������
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i]+" ");
        }
    }
    public static int[] copyOfRange(int[] arr,int start,int end) {
        // 1.����һ��������
        // ��֪�����е�Ԫ�أ��ö�̬����
        int [] newArr = new int[end-start];

        // α������˼��
        int index = 0;
        // 2.��ԭʼ�����е����ݿ�������������
        for (int i = start; i < end; i++) {
            // ��ʽ��newArr[i-start] = arr[i];
            newArr[index] = arr[i];
            index++;
        }
        // 3.����������
        return newArr;
    }
}
