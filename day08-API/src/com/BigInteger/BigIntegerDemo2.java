package com.BigInteger;

import java.math.BigInteger;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/16 11:06
 */
public class BigIntegerDemo2 {
    public static void main(String[] args) {
        //1.创建两个BigInteger的对象
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        //2.相加
        BigInteger add = bd1.add(bd2);
        System.out.println(add);

        //3.除法获取商和余数
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //4.比较是否相同
        boolean equals = bd1.equals(bd2);
        System.out.println(equals);

        //5.次幂
        BigInteger pow = bd1.pow(2);
        System.out.println(pow);

        //6.返回较大值/最小值
        BigInteger max = bd1.max(bd2);
        BigInteger min = bd1.min(bd2);
        System.out.println(max);
        System.out.println(min);
    }
}
