package com.lkbhua;

import java.util.Random;

public class test09 {
    public static void main(String[] args) {
        /*  ����һ����Ʒ�Ǻ�����ֱ��С�2��588��888��1000��10000���������
        *        ��ʹ�ô���ģ��齱����ӡ��ÿ���������ĳ���˳��Ҫ����Ҳ��ظ���
        *  ��ӡЧ����{���˳��}
        * */

        // ������
        // 1.�������飬�洢�������
        int[] arr = {2,588,888,1000,10000};

        // 2.�������������Դ洢������
        int [] newArr = new int[5];

        // 3.�齱
        Random r = new Random();
        for(int i = 0; i < 5; i++){
            // �����ȡ����
            int index = r.nextInt(arr.length);
            // ��ȡ����
            int prize = arr[index];
            boolean flag = contains(newArr,prize);
            // �жϽ����Ƿ���ڣ�������������ȡ�������ھ�����Ч����
            if(!flag){
                // �ѵ�ǰ��ȡ���Ľ�����ӵ���������
                newArr[i] = prize;
                // �����ϣ��ƶ�����
            }else{
                i--;
            }
        }

        // 4.���������飬��ӡ���
        for(int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }

    }
    public static boolean contains(int[]arr,int prize){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]== prize){
                return true;
            }
        }
        return false;
    }
}

/* ����������������������д��ң�Ȼ��ֱ�������������
import java.util.*;

public static void main(String[] args) {
    // 1.�������飬�洢�������
    Integer[] arr = {2,588,888,1000,10000};

    // 2.������ת��ΪList������˳��
    List<Integer> list = new ArrayList<>(Arrays.asList(arr));
    Collections.shuffle(list);

    // 3.��ӡ���
    System.out.println(list);
}

* */