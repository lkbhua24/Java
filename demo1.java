package com.lkbhua.InfiniteloopDemo1;

public class demo1 {
    public static void main(String[] args) {

        // 注意事项：
        // 1. 循环条件永远为true
        // 2.无线循环的下面不能再写其他的代码了，因为执行不到！
        while (true) {
            System.out.println("hello world");
        }
    }
}
