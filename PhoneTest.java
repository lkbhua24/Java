package com.lkbhua.test;

public class PhoneTest {
    public static void main(String[] args) {
        // 创建手机的对象
        Phone phone = new Phone();

        // 给手机设置属性（赋值）
        phone.brand = "OPPO";
        phone.price = 1999.9;

        // 获取手机对象中的值
        System.out.println("手机品牌是：" + phone.brand);
        System.out.println("手机价格是：" + phone.price);

        // 调用手机的方法
        phone.call();
        phone.playgame();
    }
}
