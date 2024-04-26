package com.an.Practice;

import java.util.Random;
import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/20 13:15
 */
public class lottery {
    public static void main(String[] args) {
        //1.生成中奖号码
        int[] arr = createNumber();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("========================");
        //2.用户输入彩票号码（红球 + 蓝球）
        int[] nserInputArr = nserInputNumber();

        //3.判断用户的中奖情况
        //红球 蓝球
        int redCount = 0;
        int blueCount = 0;

        //判断红球
        for (int i = 0; i < nserInputArr.length -1 ; i++) {
           int redNumber =  nserInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if(redNumber == arr[j]){
                    redCount++;
                    break;
                }
            }
        }
        //判断蓝球是否中奖
        int blueNumber =  nserInputArr[nserInputArr.length-1];
        if(blueNumber == arr[arr.length - 1]){
            blueCount++;

        }
        System.out.println(redCount);
        System.out.println(blueCount);

        //根据红球的个数已经篮球的个数来判断中奖的情况
        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜你中奖1000万");
        }else if(redCount == 6 && blueCount == 0){
            System.out.println("恭喜你中奖500万");
        }else if(redCount == 5 && blueCount == 1){
            System.out.println("恭喜你中奖3000");
        }else if((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)){
            System.out.println("恭喜你中奖200");
        }else if((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)){
            System.out.println("恭喜你中奖10");
        }else if((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)){
            System.out.println("恭喜你中奖5");
        }else {
            System.out.println("谢谢参与");
        }
    }

    public static int[] nserInputNumber() {
        //1.创建数组用于添加用户购买的彩票号码
        //6个红球1个蓝球 数组长度为7
        int[] arr = new int[7];
        //利用键盘录入号码
        Scanner sc = new Scanner(System.in);
        //让用户输入中奖号码
        for (int i = 0; i < 6; ) {
            System.out.println("输入第" + (i + 1) + "个红求号码");
            int redNumber = sc.nextInt();
            //redNumber 在1~33 唯一不重复
            if(redNumber >= 1 && redNumber <=33){
                boolean flag = contains(arr, redNumber);
                if(!flag){
                    //不存在
                    //有效的，可以添加到数组当中
                    arr[i] = redNumber;
                    i++;
                }else {
                    //存在
                    System.out.println("当前号码已存在，请重新输入");
                }


            }else {
                System.out.println("当前红球号码超出范围");
            }
        }

        //让用户输入蓝球号码
        System.out.println("请输入蓝球号码");
        //1~16
        while (true) {
            int blueNumber = sc.nextInt();
            if(blueNumber >= 1 &&blueNumber <=16){
                arr[arr.length -1] = blueNumber;
                break;
            }else {
                System.out.println("当前蓝球号码超出范围");
            }
        }
        return arr;
    }


    public static int[] createNumber() {
        //1.创建数组用于添加中奖号码
        //6个红球1个蓝球 数组长度为7
        int[] arr = new int[7];

        //2.随机添加号码添加到数组当中
        //红球不能重复
        //蓝求可以和红球重复

        //生成红球号码并添加到数组当中
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            //获取红球号码
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                //把红球号码添加到数组当中
                arr[i] = redNumber;
                i++;
            }
        }
        //生成蓝球号码并添加到数组当中
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;

    }

    //用于判断数组在数组中是否存在
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
