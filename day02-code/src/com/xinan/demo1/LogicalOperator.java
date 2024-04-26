package com.xinan.demo1;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/12 8:58
 */
public class LogicalOperator {
    public static void main(String[] args) {
        //1.& 逻辑与，两边都是真结果才是真
        System.out.println(true & true);//true
        System.out.println(false & false);//false
        System.out.println(false & true);//false
        System.out.println(true & false);//false

        System.out.println("------------------------");

        //2.| 逻辑或，两边都是假，结果才是假
        System.out.println(true | true);//true
        System.out.println(false | false);//false
        System.out.println(false | true);//true
        System.out.println(true | false);//true

        System.out.println("------------------------");


        //3.^ 逻辑异或，相同为false，不同为true
        //简单了解即可
        System.out.println(true ^ true);//false
        System.out.println(false ^ false);//false
        System.out.println(false ^ true);//true
        System.out.println(true ^ false);//true

        System.out.println("------------------------");

        //逻辑非,取反
        System.out.println(!true);//false
        System.out.println(!false);//true



    }
}
