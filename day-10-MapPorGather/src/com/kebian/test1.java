package com.kebian;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/10 21:37
 */
public class test1 {
    public static void main(String[] args) {
        //计算n个数据的和
        int sum = getSum(2, 3, 4, 5, 6);
        System.out.println(sum);
    }
    public static int getSum(int...ars){
        int sum = 0;
        for (int ar : ars) {
            sum = sum + ar;
            sum++;
        }
        return sum;
    }
}
