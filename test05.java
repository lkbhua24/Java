package com.lkbhua.operators.com.lkbhua;

public class test05 {
    public static void main(String[] args){
        /* �����������б���ߣ���֪���ǵ����Ϊ150��210��180��
        �����ߵĺ������
        * */

        // 1.��������������¼�������
        int height1 = 150;
        int height2 = 210;
        int height3 = 180;

        // 2�����ŵ�һ�����е���߸��ڶ������е���߽��бȽ�
        // ������������ȽϵĽ�������������е���߽��бȽ�
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        System.out.println(max);
        // ctrl + alt + l �Զ���ʽ������
    }
}
