package com.xinan.demo1;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/10 21:42
 */
public class StringAddition {
    public static void main(String[] args) {
        //字符串相加，当出现+是连接符，将前后的数据进行拼接，并产生新的字符串
        //连续进行+操作时，从左到右逐个执行
        System.out.println(3.7 + "帅哥");
        System.out.println("牛马" + 123);
        System.out.println('六' + "帅哥" + 123);
    }
}
