package com.xinan.demo1;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/12 15:55
 */
public class ShortCircuitLogicalOpreator {
    public static void main(String[] args) {
        //&& 短路与
        //两边都是真，结果才是真
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false

        System.out.println("-------------------");

        //|| 短路或
        //两边都是假，结果才是假
        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        System.out.println(false || false);//false

        //短路逻辑运算符具有短路效果
        //简单理解：当左边的表达式能确定最终的结果，那么右边就不会参与计算
        System.out.println("----------------------");

        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);//11
        System.out.println(b);//10(左边已经确定右边就不参与运行 )



    }
}
