package com.五道经典算法题.小明爬楼梯;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/28 19:28
 */
public class test {
    public static void main(String[] args) {
        /*
        可爱的小明特别喜欢爬楼梯，他有时候一次爬一个台阶，有时候一次爬两个台阶,有时候一次爬三个台阶
        如果这个楼梯有20个台阶，小明一个有多少种爬法。
         */
        System.out.println(getNum(20));
    }
    public static int  getNum(int num){
        if (num == 1) {
            return 1;
        }
        if(num == 2){
            return 2;
        }
        if(num == 3){
            return 4;
        }
        return getNum(num-1) +getNum(num-2)+getNum(num-3);
        }
    }

