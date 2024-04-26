package com.BigDecima;

import java.math.BigDecimal;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/24 14:24
 */
public class BigDecimalDemo1 {
    public static void main(String[] args) {


        //1.通过传递double类型的小数来创建对象
        //细节：这种方式可能不精确，不推荐
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);

        System.out.println(bd1);
        System.out.println(bd2);

        //2.通过传递字符串表示小数来创建
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        System.out.println(bd3);
        System.out.println(bd4);
        BigDecimal add = bd3.add(bd4);
        System.out.println(add);

        //3.通过静态方法获取对象
        BigDecimal bigDecimal = BigDecimal.valueOf(10);


    }
}
