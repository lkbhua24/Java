package com.lkbhua.loopdemo;

public class demo1 {
    public static void main(String[] args){
        /*  需求：求1-5之间的和
        * */
        int sum = 0;
        for(int i=0;i<5;i++){
            // int sum = 0;
            // 扩展小点：
            // 1. 求和的变量不能定义在循环里面，因为变量的作用域不能超过循环
            // 2. 如果我们把变量定义在循环里面，那么当前变量只能在本次循环中有效
            // 当本次循环结束之后，sum变量就会销毁，下次循环的时候，sum变量就会重新创建
            sum += i;
            System.out.println("sum="+sum);
        }
    }
}
