package com.an.Method;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/6 1:02
 */
public class ParametricMethod2 {
    public static void main(String[] args) {
        /*需求：定义一个方法，求长方形的周长，将结果在方法中进行打印*/

        //调用无参方法
        Perimeter();

        //调用有参方法
        perimeter2(10,10);

    }

    //定义一个无参方法
    public static void Perimeter(){
        int length = 10;
        int wide = 20;

        int perimeter = (length + wide) * 2;
        System.out.println(perimeter);
    }

    //定义一个带参方法
    public static void perimeter2(int length2,int wide2){
        int perimeter2 = (length2 + wide2) * 2;
        System.out.println(perimeter2);
    }

}
