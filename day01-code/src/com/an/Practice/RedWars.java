package com.an.Practice;

import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/14 3:06
 */
public class RedWars {
    public static void main(String[] args) {
        /*
        * 需求：
        * 一个大V直播抽奖，奖品是现金红包，分别有（2，588，888，1000，10000）五个奖金。
        * 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序随机且不重复。
        * 打印效果如下：888元的奖金被抽出     （随机顺序，不一定是下面的顺序）
        *              588元的奖金被抽出
        *              10000元的奖金被抽出
        *              1000元的奖金被抽出
        *              2元的奖金被抽出
        * */

        //分析：
        //1.定义数组表示奖池
        int[] array = {2,588,888,1000,10000};
        //2.定义一个新的数组用于存储抽奖的结果
        int[] newarray = new int[array.length];
        //3.抽奖
        Random r = new Random();
        //有5个奖项，这里就要循环5次
        for(int i = 0;i < 5;){
            //获取随机索引
            int randomIndex = r.nextInt(array.length);
            //获取奖项
            int prize = array[randomIndex];
            boolean flag = contains(newarray,prize);
            if(!flag){
                newarray[i] = prize;
                i++;
            }
        }
        //4.遍历newArray
        for (int i = 0; i < newarray.length; i++) {
            System.out.println(newarray[i]);
        }


    }
    //判断prize在数组当中是否存在
    //存在：true
    //不存在：false
    public static boolean contains(int[] array, int prize){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==prize){
                return true;
            }
        }
        return false;
    }
}
