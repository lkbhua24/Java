package com.lkbhua.operators;

public class ArithmeticoperatorsDemo4 {
    public static void main(String[] args) {
        // +=
        // ���򣺽���ߺ��ұ߽�����ӣ������������߱���
        int a = 10;
        int b = 5;
        // ��a+b���ٰѽ����ֵ��a
        a+=b;
        System.out.println(a);
        System.out.println(b);


        // ϸ�ڣ�
        // += -= *= /= %= �ײ㶼������һ��ǿ������ת��
        short c = 10;
        // ����ߺ��ұ߽�����ӣ��õ����2���ٸ�ֵ�� c
        c+=1;
        // ��ͬ�ڣ� c = (short)(c+1);
        System.out.println(c);
    }
}
