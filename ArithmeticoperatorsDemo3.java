package com.lkbhua.operators;

public class ArithmeticoperatorsDemo3 {
    public static void main(String[] args)
    {
        // ++ --
        int a = 10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);
        int x = 10;
        // ��++�����ú��
        // �Ȱ�x��������y�������ټ�1
        // ��ֵ��y��ֵ������ǰ��
        int y = x++;
        // ��++���ȼӺ���
        // �ȼ�1���ٸ�ֵ��z����
        int z = ++x;
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("z:"+z);

    }
}
