package com.lkbhua.loopdemo;

public class whiledemo1 {
    public static void main(String[] args) {
        /*  ������������壨8848.43m������������һ���㹻���ֽ�����ĺ����0.1mm ��
        *   ÿ��ֽ�����۵����ٴΣ����ܰ����������ѹ flat
        * */


        // �������۵�ֽ�ţ�ÿһ���۵�ֽ�ŵĺ�ȶ���ԭ��������
        // double d = 0.1;
        // d = d*2��
        // d*=2��

        // 1.����һ��������¼ɽ��ĸ߶�
        int mountainHeight = 8848430;

        // 2.����һ��������¼�۵�����ʼ���
        double thickness = 0.1;
        int count = 0;

        // 3.ѭ��ֽ���۵���ֱ��ֽ�ŵĺ�ȴ��ڵ���ɽ��ĸ߶�
        while(thickness<=mountainHeight){
            thickness *= 2;
            count++;
            if(thickness>=mountainHeight)
            {
                System.out.println("�۵���"+count+"�Σ�ֽ�ŵĺ��Ϊ"+thickness);
            }
        }
    }
}
