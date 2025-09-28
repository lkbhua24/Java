package com.lkbhua.loopdemo;

public class whiledemo1 {
    public static void main(String[] args) {
        /*  需求：珠穆朗玛峰（8848.43m），假如我有一张足够大的纸，它的厚度是0.1mm ，
        *   每张纸可以折叠多少次，才能把珠穆朗玛峰压 flat
        * */


        // 分析：折叠纸张：每一次折叠纸张的厚度都是原来的两倍
        // double d = 0.1;
        // d = d*2；
        // d*=2；

        // 1.定义一个变量记录山峰的高度
        int mountainHeight = 8848430;

        // 2.定义一个变量记录折叠的起始厚度
        double thickness = 0.1;
        int count = 0;

        // 3.循环纸张折叠，直到纸张的厚度大于等于山峰的高度
        while(thickness<=mountainHeight){
            thickness *= 2;
            count++;
            if(thickness>=mountainHeight)
            {
                System.out.println("折叠了"+count+"次，纸张的厚度为"+thickness);
            }
        }
    }
}
