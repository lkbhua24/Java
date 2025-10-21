package com.lkbhua;

public class TwoDimensionDemo3 {
    public static void main(String[] args) {
        /*   需求：某商城每个季度的营业额如下：单位（王元）
            第一季度：22，66，44
            第二季度：77，33，88
            第三季度：25，45，65
            第四季度：11，66，99
            要求计算出每个季度的营业额，并求出所有季度营业额之和
        * */
        int[][] yearArr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };

        // 1.计算所有季度营业额之和
        int yearSum = 0;

        // 2.遍历二维数组，获取每个季度的营业额
        for (int i = 0; i < yearArr.length; i++) {
            // 二维数组中的每个一维数组
            int[] quarterArr = yearArr[i];
            int sum = getSum(quarterArr);
            System.out.println("第" + (i+1) + "季度的营业额为：" + sum);
            yearSum += sum;
        }
        System.out.println("所有季度营业额之和为：" + yearSum);

    }
    // 定义一个方法，计算出每一个季度的营业额
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
