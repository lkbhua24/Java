package com.lkbhua.operators;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        // 1.&&�߼���
        // ���߶�Ϊ�棬���������
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // 2.||�߼���
        // ������һ��Ϊ�棬���������
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // 3.!�߼���
        // ����Ϊ�棬���Ϊ��
        // ȡ����̾�Ų�Ҫд��Σ�Ҫô��д��Ҫôֻдһ��
        System.out.println(!true);
        System.out.println(!false);

        // 4.^�߼����
        // ���߲�ͬΪ�棬���������
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false^false);

    }
}
