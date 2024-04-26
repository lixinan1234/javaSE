package com.an.Method;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/7 10:28
 */
public class ReturnValue {
    public static void main(String[] args) {
        /*需求：定义一个方法，求一家商场每个季度的营业额。
                根据方法结果再计算出全年营业额
                */
        //调用方法
        //1.直接调用
        //quota(1000,1500,2000,800);

        //2.赋值调用
        //int t = quota(1000,1500,2000,800);
        //System.out.println(t);

        //3.输出调用
        //System.out.println( quota(1000,1500,2000,800));


        //计算第一个季度的营业额
        int sum1 = quota(20, 25, 10, 10);
        //计算第二个季度的营业额
        int sum2 = quota(40, 10, 20, 15);
        //计算第三个季度的营业额
        int sum3 = quota(60, 20, 10, 9);
        //计算第四个季度的营业额
        int sum4 = quota(27, 25, 26, 29);

        //求全年的总营业额
        int sum = sum1 + sum2 + sum3 + sum4;
        System.out.println(sum);

    }

    //定义一个带返回值的方法
    public static int quota(int a, int b, int c, int d) {
        int t = a + b + c + d;
        return t;//返回给方法调用处
    }

}
