package com.lkbhua;

public class TwoDimensionDemo2 {
    public static void main(String[] args) {
        /*  需求：创建二维数组，并遍历
          *  二维数组：动态二维
        * */

        // 1.利用动态初始化格式创建二维数组
        // 3：表示二维数组的行数为3，可以装3个一维数组
        // 5：表示每个一维数组的列数为5，5个元素
        int[][] arr = new int[3][5];

        // 2.给二维数组赋值
        arr[0][0] = 1;

        // 3.遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
