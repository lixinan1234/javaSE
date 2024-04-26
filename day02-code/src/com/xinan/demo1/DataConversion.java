package com.xinan.demo1;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/10 17:13
 */
public class DataConversion {
    public static void main(String[] args) {
        byte b1 = 100;
        byte b2 = 100;
        //(byte)bi+b2不是最终结果，要(byte) (b1 + b2)才正确
        byte result = (byte) (b1 + b2);
        System.out.println(result);//结果发生错误了，因为要转换的数据过大。
    }
}
