package com.lkbhua;

import java.util.Random;

public class test09 {
    public static void main(String[] args) {
        /*  需求：一个奖品是红包，分别有【2，588，888，1000，10000】五个奖金。
        *        请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
        *  打印效果：{随机顺序}
        * */

        // 分析：
        // 1.定义数组，存储五个奖金
        int[] arr = {2,588,888,1000,10000};

        // 2.定义新数组用以存储抽象结果
        int [] newArr = new int[5];

        // 3.抽奖
        Random r = new Random();
        for(int i = 0; i < 5; i++){
            // 随机获取索引
            int index = r.nextInt(arr.length);
            // 获取奖项
            int prize = arr[index];
            boolean flag = contains(newArr,prize);
            // 判断奖项是否存在，如果存在随机抽取，不存在就是有效奖项
            if(!flag){
                // 把当前抽取到的奖项添加到新数组中
                newArr[i] = prize;
                // 添加完毕，移动索引
            }else{
                i--;
            }
        }

        // 4.遍历新数组，打印结果
        for(int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }

    }
    public static boolean contains(int[]arr,int prize){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]== prize){
                return true;
            }
        }
        return false;
    }
}

/* 方法二：依靠本身将数组进行打乱，然后直接输出遍历数组
import java.util.*;

public static void main(String[] args) {
    // 1.定义数组，存储五个奖金
    Integer[] arr = {2,588,888,1000,10000};

    // 2.将数组转换为List并打乱顺序
    List<Integer> list = new ArrayList<>(Arrays.asList(arr));
    Collections.shuffle(list);

    // 3.打印结果
    System.out.println(list);
}

* */