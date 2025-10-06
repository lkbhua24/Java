package com.lkbhua.Test;

import java.util.Random;

public class Arraytest05 {
    public static void main(String[] args) {
        /*  需求：生成10个1-100之间的数字，并放到数组中
          * 1> 求出所有数据的和
          * 2> 找出所有数据的平均数
          * 3> 统计有多少个数据比平均数小
        * */

        // 分析：
        // 1.定义一个数组
        // 动态初始化（数字还未知）
        int [] arr = new int[10];

        // 2.生成10个1-100之间的数字
        Random r = new Random();
        for(int i = 0; i < arr.length; i++){
            // 每循环一次，就会生成一个新的随机数
            int num = r.nextInt(100)+1;
            arr[i] = num;
        }


        // 3.求和
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("和为："+sum);

        // 4.求平均数
        double avg = (double)sum / arr.length;
        System.out.println("平均数为："+avg);

        // 5.统计有多少个数据比平均数小
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < avg){
                count++;
                System.out.println(arr[i]);
            }
        }
        System.out.println("有"+count+"个数据比平均数小");


        // 遍历数组（验证答案）
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("==================");



    }
}
