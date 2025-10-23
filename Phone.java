package com.lkbhua.test;

public class Phone {
        // 面向对象

    // 属性
    String brand; // 手机品牌
    double price; // 手机价格

    // 行为：是以方法的形式来体现的，跟之前的相比是不加static
    public void call() {
        System.out.println("正在给打电话");
    }
    public void playgame() {
        System.out.println("正在打游戏");
    }
}
