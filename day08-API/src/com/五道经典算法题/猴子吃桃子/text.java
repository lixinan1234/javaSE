package com.五道经典算法题.猴子吃桃子;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/28 19:06
 */
public class text {
    public static void main(String[] args) {
        /*
        有一推桃子，猴子第一天吃了其中的一半，并多吃了一个！
        以后每天猴子都吃当前剩下的一半，然后再吃一个
        第10天的时候（还没吃），发现就剩下了一个桃子，请问，最初总共多少只桃子。

        day10: 1
        day9: (day10 + 1) *2 =4
        day8: (day9 + 1) *1 =10
        特点：每一天的桃子数量都是后一天天数加1，乘以2。
         */

        System.out.println(getCount(1));

    }
    public static int getCount(int day){
        if (day <=0||day >=11){
            System.out.println("时间不正确");
            return -1;
        }
        //递归进口
        if (day == 10) {
            return 1;
        }
        //书写规律
        //每一天的桃子数量都是后一天天数加1，乘以2。
        return (getCount(day+1)+1)*2;
        }
    }

