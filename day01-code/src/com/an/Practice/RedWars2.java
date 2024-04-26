package com.an.Practice;

import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/14 3:06
 */
public class RedWars2 {
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

        //定义一个奖池
        int[] array = {2,588,888,1000,10000};
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            //获取随机索引
            int randomIndex = r.nextInt(array.length);
            //拿着i跟随机索引上的值进行交换
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        //遍历奖池
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
