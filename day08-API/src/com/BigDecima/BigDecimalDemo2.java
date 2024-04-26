package com.BigDecima;

import java.math.BigDecimal;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/24 15:23
 */
public class BigDecimalDemo2 {
    public static void main(String[] args) {


        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(2.0);

        //1.加法
        BigDecimal add = bd1.add(bd2);
        System.out.println("加法："+add);

        //2.减法
        BigDecimal subtract = bd1.subtract(bd2);
        System.out.println("减法："+subtract);

        //3.乘法
        BigDecimal multiply = bd1.multiply(bd2);
        System.out.println("乘法："+multiply);

        //4.除法
        BigDecimal divide = bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP);
        System.out.println("除法："+divide);



    }
}
