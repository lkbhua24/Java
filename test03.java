package com.lkbhua;

import java.util.Random;

public class test03 {
    public static void main(String[] args) {
        /*  ���󣺶��巽��ʵ���������һ��5λ����֤��
           ��֤���ʽ��
           1. ����Ϊ5
           2. ǰ��λ�Ǵ�д��ĸ��Сд��ĸ
           3. ���һλ������
        * */
        // ������
        // A-Z a-z
        // ���Ժ��������Ҫ��һ��û��ʲô���ɵ������������ȡ
        // �����Ȱ���Щ���ݷŵ����鵱��
        // �������ȡһ������

        // 1.��С��ĸ��Сд��ĸ���ŵ����鵱��
        // �ѵ㣺��ΰѴ�Сд��ĸ�ŵ����鵱��
        char [] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            // ASCII���
            if(i<=25){
                // ���Сд��ĸ
                chs[i]=(char)(97+i); //97��ascii�������a��ASCII�룬����97+i����a+i

            }
            else{
                // ��Ӵ�д��ĸ
                chs[i]=(char)(65+i-26); //65��ascii�������A��ASCII�룬����65+i-26����A+i
            }
        }
        // ����һ���ַ������͵ı���������������ɵ��ַ�
        String str = "";

        // 2.�����ȡ�����Ĵ�
        Random r = new Random();
        // 0-51
        // �������������ȡ�ַ�
        for(int i = 0; i < 4; i++){
            int randomIndex = r.nextInt(chs.length);
            str = str += chs[randomIndex];
        }

        // 3.�����ȡһ������
        int num = r.nextInt(10);
        str = str + num;

        // 4.ƴ���ַ���
        System.out.println(str);
    }
}
