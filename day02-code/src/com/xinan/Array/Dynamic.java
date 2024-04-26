package com.xinan.Array;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/4 12:17
 */
public class Dynamic {
    public static void main(String[] args) {
        /*定义一个数组，用来存班级50个学生的姓名
        姓名未知，等学生报道后，再进行添加
         */


        String[] array = new String[50];
        //添加学生
        array[0] = "工藤新一";
        array[1] = "怪盗基德";
        array[2] = "赤井秀一";
        //获取
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);//打印出来的是默认初始化的值null
    }
}
