package com.lkbhua;

import com.sun.jdi.ArrayReference;

import java.util.Random;
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        /*  ����˫ɫ���н�
        * */
        // 1.�����н�����
        int[] arr = createNumber(); // ע�⣺����123456 7
                                            // �û������ 654321��Ҳ���н�
        // ֻ��Ҫ������ͬ�����־����н�������Ҫλ��һ��


        // 2.���û������н�����
        int []userInputerArr = userinputNumber();

        System.out.println("=====================");

        // ��֤�û�����ĺ���
        System.out.print("�û�����ĺ���Ϊ��");
        for(int i = 0; i < userInputerArr.length; i++){
            System.out.print(userInputerArr[i]+" ");
        }
        System.out.println("������ȷ����ĺ��룺1.ȷ�� 2.��ȷ��");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if(type == 1){
            // 3.�ж��Ƿ��н�
            // ���������
            int redCount = 0;
            int blueCount = 0;

            // �жϺ����н����
            for (int i = 0; i < userInputerArr.length-1; i++) { // ����һ��Ҫ-1����Ϊ�����ж�����
                int redNumber = userInputerArr[i];
                // �����û�����ĺ���ȥ�ȽϿ������ɵĺ���������ڲ�����ͬ�ĺ���
                for (int j = 0; j < arr.length-1; j++) {
                    if(redNumber == arr[j]){
                        redCount++;
                        // ����ҵ��ˣ���ô���������û�б�Ҫ����ȥ�Ƚ���
                        // ��������ѭ����������һ���û�����ĺ�������ж�
                        break;
                    }
                }
            }

            // �ж������Ƿ��н�
            int blueNumber = userInputerArr[userInputerArr.length-1];
            if(blueNumber == arr[arr.length-1]){
                blueCount++;
            }
            System.out.println("�н����������" + redCount);
            System.out.println("�н����������" + blueCount);


            // ���ݺ���ĸ����Լ�����ĸ������ж��н����
            if(redCount == 6 && blueCount == 1){
                System.out.println("��ϲ�㣬�н���NO1.1000w��");
            }
            else if(redCount == 6 && blueCount == 0){
                System.out.println("��ϲ�㣬�н���NO2.500w��");
            }
            else if(redCount == 5 && blueCount == 1){
                System.out.println("��ϲ�㣬�н���NO3.300w��");
            }
            else if(redCount == 5 && blueCount == 0|| redCount == 4 && blueCount == 1){
                System.out.println("��ϲ�㣬�н���NO4.200w��");
            }
            else if(redCount == 4 && blueCount == 0|| redCount == 3 && blueCount == 1){
                System.out.println("��ϲ�㣬�н���NO5.100w��");
            }
            else if(redCount == 3 && blueCount == 0|| redCount == 2 && blueCount == 1){
                System.out.println("��ϲ�㣬�н���NO6.10w��");
            }
            else if(redCount == 2 && blueCount == 0|| redCount == 1 && blueCount == 1){
                System.out.println("��ϲ�㣬�н���NO7.5w��");
            }
            else if(redCount == 1 && blueCount == 0){
                System.out.println("��ϲ�㣬you are the ��ù����");
            }


        }
        if(type == 2){
            System.out.println("���������룺");
            userinputNumber();
        }

        // ��֤һ���н�����
        System.out.print("�н�����Ϊ��");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }


    // �û������н����뷽��
    public static int[] userinputNumber(){
        // 1.�û�������н�����
        int []arr = new int[7];

        // 2.���ü�������¼��
        Scanner sc = new Scanner(System.in);
        System.out.println("������6��������룺");
        for (int i = 0; i < arr.length-1; i++){
            System.out.println("�������" + (i+1) + "�����룺");
            int redNumber = sc.nextInt();
            // �жϷ�Χ���Ҳ��ظ�
            if(redNumber >= 1 && redNumber <= 33){
                boolean flag = contains(arr,redNumber);
                if(!flag){
                    // ����������ĺ��룬��û���ظ�����¼��
                    arr[i] = redNumber;
                }
                else{
                    // ���ڣ�������
                    System.out.println("��������ظ������������룺");
                }
            }
            else{
                System.out.println("������볬����Χ�����������룺");
            }
        }

        // ���û������������
        System.out.println("������������룺");
        int blueNumber = sc.nextInt();
        // �жϷ�Χ
        while(true){
            if(blueNumber >= 1 && blueNumber <= 16){
                arr[arr.length-1] = blueNumber;
                break;
            }
            else{
                System.out.println("������볬����Χ�����������룺");
            }
        }

        // �����û�����ĺ�������
        return arr;
    }


    public static int[] createNumber(){
        // 1.�����������Դ洢�н�����
        // 6������ ��1������ ���鳤��7
        int []arr = new int[7];

        // 2.�������6������
        // ���򣺲����ظ���
        // ���򣺿��Ը������ظ�����Χ1-16

        // ���ɺ��������ӵ����鵱��
        Random r = new Random();
        for (int i = 0; i < 6; i++){
            // ��ȡ�������
          int redNumber = r.nextInt(33)+1;
          boolean flag = contains(arr,redNumber);
          if(!flag){
                // �Ѻ��������ӵ����鵱��
              arr[i] = redNumber;
          }
        }

        // ����������벢��ӵ����鵱��
        int blueNumber = r.nextInt(16)+1;
        arr[6] = blueNumber;

        // ���н����鷵��
        return arr;
    }

    // �ж��������Ƿ����ָ����Ԫ��
    public static boolean contains(int[]arr,int number) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }


}
