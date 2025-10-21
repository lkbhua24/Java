package com.lkbhua;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        /*  二位数组知识点
        * */

        // 1.二位数组的静态初始化
        // 数据类型[][] 数组名 = {{元素1,元素2},{元素3,元素4}};
        int[][] arr1 = {{1,2},{3,4}};
        int[][] arr2 = new int[][]{{1,2,3},{4,5,6}};

        // 建议此种方式书写
        int[][] arr3 = {{1,2,3},
                        {4,5,6}};

        // 2.获取元素
        // arr[i][j];
        // arr:二维数组
        // i:行索引
        // j:列索引
        System.out.println(arr3[0]); //[I@10f87f48 ：表示获取二位数组中的第一个数组
        System.out.println(arr3[0][0]);
        System.out.println(arr3[0][1]);
        System.out.println(arr3[0][2]);
        System.out.println(arr3[1][0]);
        System.out.println(arr3[1][1]);
        System.out.println(arr3[1][2]);


        // 3.二维数组的遍历
        // 外循环：遍历二维数组中的每一行
        for (int i = 0; i < arr3.length; i++) {
            // 内循环：遍历二维数组中的每一行中的每一个元素
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j]+"\t");
            }
        }
    }
}
