package com.an.Method;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/7 13:53
 */
public class HeavyLoad {
    public static void main(String[] args) {
        /*
         * 需求：使用方法重载的思想，设计比较两个整数是否相同的方法
         * 要求：兼容全整数类型（byte,short,int,long）
         * */

        //调用方法
        //(类型)强制转换
        num((byte) 10,(byte)20);

    }

    //定义一个方法
    public static void num(byte num1,byte num2){
        System.out.println("byte");
        System.out.println(num1 == num2);
    }

    public static void num(short num3,short num4){
        System.out.println("short");
        System.out.println(num3 == num4);
    }

    public static void num(int num5,int num6){
        System.out.println("int");
        System.out.println(num5 == num6);
    }

    public static void num(long num7,long num8){
        System.out.println("long");
        System.out.println(num7  == num8);
    }


}
