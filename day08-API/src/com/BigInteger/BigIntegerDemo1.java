package com.BigInteger;

import java.math.BigInteger;
import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/16 10:10
 */
public class BigIntegerDemo1 {
    public static void main(String[] args) {


        //1.获取一共随机的大整数
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            BigInteger bd1 = new BigInteger(4,r);
            System.out.println(bd1);//[0 ~ 15]
        }

        //获取一个指定的大整数
        BigInteger bd2 = new BigInteger("99999999999999999999999999999");
        System.out.println(bd2);
    }
}
