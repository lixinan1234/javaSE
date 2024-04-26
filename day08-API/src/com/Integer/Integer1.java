package com.Integer;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/19 15:22
 */
public class Integer1 {
    public static void main(String[] args) {

        //1.把整数转成二进制，八进制，十六进制
        String s1 = Integer.toBinaryString(100);
        System.out.println(s1);

        String s2 = Integer.toOctalString(100);
        System.out.println(s2);

        String s3 = Integer.toHexString(100);
        System.out.println(s3);

        //2.将字符串类型的整数转成int类型的整数
        int i1 = Integer.parseInt("100");
        int i2 = 10;
        System.out.println(i1+i2);

    }
}
