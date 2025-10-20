package com.lkbhua;

import com.sun.jdi.ArrayReference;

import java.util.Random;
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        /*  需求：双色球中奖
        * */
        // 1.创建中奖号码
        int[] arr = createNumber(); // 注意：比如123456 7
                                            // 用户买的是 654321折也算中奖
        // 只需要存在相同的数字就是中奖，不需要位置一致


        // 2.让用户输入中奖号码
        int []userInputerArr = userinputNumber();

        System.out.println("=====================");

        // 验证用户输入的号码
        System.out.print("用户输入的号码为：");
        for(int i = 0; i < userInputerArr.length; i++){
            System.out.print(userInputerArr[i]+" ");
        }
        System.out.println("请输入确认你的号码：1.确认 2.不确定");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if(type == 1){
            // 3.判断是否中奖
            // 红球和蓝球
            int redCount = 0;
            int blueCount = 0;

            // 判断红球中奖情况
            for (int i = 0; i < userInputerArr.length-1; i++) { // 这里一定要-1，因为不用判断蓝球
                int redNumber = userInputerArr[i];
                // 拿着用户输入的红球去比较看看生成的红球号码中在不在相同的号码
                for (int j = 0; j < arr.length-1; j++) {
                    if(redNumber == arr[j]){
                        redCount++;
                        // 如果找到了，那么后面的数字没有必要继续去比较了
                        // 就跳出内循环，继续下一个用户输入的红球号码判断
                        break;
                    }
                }
            }

            // 判断蓝球是否中奖
            int blueNumber = userInputerArr[userInputerArr.length-1];
            if(blueNumber == arr[arr.length-1]){
                blueCount++;
            }
            System.out.println("中奖红球个数：" + redCount);
            System.out.println("中奖蓝球个数：" + blueCount);


            // 根据红球的个数以及蓝球的个数来判断中奖情况
            if(redCount == 6 && blueCount == 1){
                System.out.println("恭喜你，中奖了NO1.1000w！");
            }
            else if(redCount == 6 && blueCount == 0){
                System.out.println("恭喜你，中奖了NO2.500w！");
            }
            else if(redCount == 5 && blueCount == 1){
                System.out.println("恭喜你，中奖了NO3.300w！");
            }
            else if(redCount == 5 && blueCount == 0|| redCount == 4 && blueCount == 1){
                System.out.println("恭喜你，中奖了NO4.200w！");
            }
            else if(redCount == 4 && blueCount == 0|| redCount == 3 && blueCount == 1){
                System.out.println("恭喜你，中奖了NO5.100w！");
            }
            else if(redCount == 3 && blueCount == 0|| redCount == 2 && blueCount == 1){
                System.out.println("恭喜你，中奖了NO6.10w！");
            }
            else if(redCount == 2 && blueCount == 0|| redCount == 1 && blueCount == 1){
                System.out.println("恭喜你，中奖了NO7.5w！");
            }
            else if(redCount == 1 && blueCount == 0){
                System.out.println("恭喜你，you are the 倒霉蛋！");
            }


        }
        if(type == 2){
            System.out.println("请重新输入：");
            userinputNumber();
        }

        // 验证一下中奖号码
        System.out.print("中奖号码为：");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }


    // 用户输入中奖号码方法
    public static int[] userinputNumber(){
        // 1.用户输入的中奖号码
        int []arr = new int[7];

        // 2.利用键盘输入录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入6个红球号码：");
        for (int i = 0; i < arr.length-1; i++){
            System.out.println("请输入第" + (i+1) + "个号码：");
            int redNumber = sc.nextInt();
            // 判断范围而且不重复
            if(redNumber >= 1 && redNumber <= 33){
                boolean flag = contains(arr,redNumber);
                if(!flag){
                    // 不存在输入的号码，即没有重复可以录入
                    arr[i] = redNumber;
                }
                else{
                    // 存在，不填入
                    System.out.println("输入号码重复，请重新输入：");
                }
            }
            else{
                System.out.println("输入号码超出范围，请重新输入：");
            }
        }

        // 让用户输入蓝球号码
        System.out.println("请输入蓝球号码：");
        int blueNumber = sc.nextInt();
        // 判断范围
        while(true){
            if(blueNumber >= 1 && blueNumber <= 16){
                arr[arr.length-1] = blueNumber;
                break;
            }
            else{
                System.out.println("输入号码超出范围，请重新输入：");
            }
        }

        // 返回用户输入的号码数组
        return arr;
    }


    public static int[] createNumber(){
        // 1.创建数组用以存储中奖号码
        // 6个红球 ，1个蓝球 数组长度7
        int []arr = new int[7];

        // 2.随机生成6个号码
        // 红球：不能重复的
        // 蓝球：可以跟红球重复，范围1-16

        // 生成红球号码添加到数组当中
        Random r = new Random();
        for (int i = 0; i < 6; i++){
            // 获取红球号码
          int redNumber = r.nextInt(33)+1;
          boolean flag = contains(arr,redNumber);
          if(!flag){
                // 把红球号码添加到数组当中
              arr[i] = redNumber;
          }
        }

        // 生成蓝球号码并添加到数组当中
        int blueNumber = r.nextInt(16)+1;
        arr[6] = blueNumber;

        // 把中奖数组返回
        return arr;
    }

    // 判断数组中是否包含指定的元素
    public static boolean contains(int[]arr,int number) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }


}
