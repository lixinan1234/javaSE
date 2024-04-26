package com.xinan.demo4;

import java.util.Random;
import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/1 17:44
 */
public class RandomNumber4 {
    public static void main(String[] args) {

        //需求：程序自动生成一个1~100的随机数，使用程序实现猜出这个数是多少？
        //扩展小需求：加一个保底机制，5次猜不中，就直接提示猜中了

        //抽奖机制
        //用点卷去抽水晶
        //保底5次


        //计数器
        //用来统计当前已经猜了多少次。
        int count = 0;
        //1.生成 1 ~ 100 的随机数
        Random r = new Random();
        int number = r.nextInt(100)+1;
        //2.键盘录入
        Scanner sc = new Scanner(System.in);
      while (true){
          System.out.println("请输入您要猜的数字");
          int guessNumber = sc.nextInt();
          //3.判断两数字给出不同的提示
          //猜的数字大了，提示 大了
          //猜的数字小了，提示 小了
          //猜的数字一样，提示 猜中了

          //4.计数器猜的数
          count ++;
          if(count == 5){
              System.out.println("猜中了");
          }
          if (number < guessNumber){
              System.out.println("大了");
          }else if(number > guessNumber){
              System.out.println("小了");
          }else{
              System.out.println("猜中了");
              break;
          }

      }
    }
}
