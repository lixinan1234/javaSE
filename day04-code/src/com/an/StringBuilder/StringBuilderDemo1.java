package com.an.StringBuilder;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/5 11:21
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //1.创建StringBuilder对象
        StringBuilder sb = new StringBuilder("abc");


        //2.添加元素
        /*sb.append("def");
        sb.append(1);
        sb.append(true);*/


        //3.容器内容反转
        //sb.reverse();


        //4.获取长度
        //int len = sb.length();
        //System.out.println(len);



        //打印
        System.out.println(sb);


    }
}
