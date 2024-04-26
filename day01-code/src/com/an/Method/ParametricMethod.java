package com.an.Method;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/6 0:46
 */
public class ParametricMethod {
    public static void main(String[] args) {
        //目标：掌握带参数方法定义的格式和调用格式

        cansu(80,20);

    }

    //定义一个带参数的方法
    public static void cansu(int num1,int num2){
        int number = num1 + num2;
        System.out.println(number);
    }

}
