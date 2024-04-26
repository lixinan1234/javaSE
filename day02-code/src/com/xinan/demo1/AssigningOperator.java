package com.xinan.demo1;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/11 16:48
 */
public class AssigningOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //+=
        //规则：将左边的和右边的进行相加，然后再把结果赋值给左边
        a += b;
        System.out.println(a);//30
        System.out.println(b);//20

        //细节
        //把左边的和右边的进行相加得到6，然后赋值给左边变量
        int t = 5;
        t +=1;
        System.out.println(t);//6



    }
}
