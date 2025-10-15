package com.lkbhua.Test;
import java.util.Scanner;
public class test07 {
    public static void main(String[] args) {
        /*  需求：定义一个方法判断数组中的某一个数是否存在，将结果返回给调用者
        * */
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean result = find(arr,10);
        System.out.println(result);
    }
    // 分析：
    // 1.你要干嘛？              判断数字是否在数组中
    // 2.需要怎么样才能完成？      需要数组、待查找的数字
    // 3，调用处是否返回结果？     返回true/false
    public static boolean find(int [] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}
// return break 的区别
// return：其实跟循环没有什么关系，跟方法有关的，表示1结束方法，2返回结果
//        如果方法执行到了return，那么方法就会结束，循环也会随之结束。
// break：跟循环有关，表示结束循环，还会执行循环外的方法内的后续代码。