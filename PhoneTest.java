package com.lkbhua.test;

public class PhoneTest {
    public static void main(String[] args) {
        // �����ֻ��Ķ���
        Phone phone = new Phone();

        // ���ֻ��������ԣ���ֵ��
        phone.brand = "OPPO";
        phone.price = 1999.9;

        // ��ȡ�ֻ������е�ֵ
        System.out.println("�ֻ�Ʒ���ǣ�" + phone.brand);
        System.out.println("�ֻ��۸��ǣ�" + phone.price);

        // �����ֻ��ķ���
        phone.call();
        phone.playgame();
    }
}
