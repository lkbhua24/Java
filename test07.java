package com.lkbhua.Test;
import java.util.Scanner;
public class test07 {
    public static void main(String[] args) {
        /*  ���󣺶���һ�������ж������е�ĳһ�����Ƿ���ڣ���������ظ�������
        * */
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean result = find(arr,10);
        System.out.println(result);
    }
    // ������
    // 1.��Ҫ���              �ж������Ƿ���������
    // 2.��Ҫ��ô��������ɣ�      ��Ҫ���顢�����ҵ�����
    // 3�����ô��Ƿ񷵻ؽ����     ����true/false
    public static boolean find(int [] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}
// return break ������
// return����ʵ��ѭ��û��ʲô��ϵ���������йصģ���ʾ1����������2���ؽ��
//        �������ִ�е���return����ô�����ͻ������ѭ��Ҳ����֮������
// break����ѭ���йأ���ʾ����ѭ��������ִ��ѭ����ķ����ڵĺ������롣