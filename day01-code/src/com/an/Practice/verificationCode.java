package com.an.Practice;

import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/13 16:02
 */
public class verificationCode {
    public static void main(String[] args) {
        /*
        *需求：
        * 定义一个方法实现生成随机数产一个5位数的验证码
        * 验证码格式：
        *        ·长度为5
        *        ·前4位是大写的字母或者是小写字母
        *        ·最后一位是数字
        * */

        //分析：1.大写字母和小写字母放到数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表
            if(i<=25){
                //添加小写字母
                chs[i] = (char) (97 + i);
            }else {
                //添加大写字母
                //A~65
                chs[i] = (char) (65 + i -26);
            }
        }
        //遍历
//        for (int i = 0; i < chs.length; i++) {
//            System.out.print(chs[i] + " ");
//        }


        //定义一个字符串类型的变量，用来记录最终结果
        String result = "";
        //2.随机抽取四次
        Random r  = new Random();
        //生成随机数
        for (int i = 0; i < 4; i++) {
            int random = r.nextInt(chs.length);
            //利用随机索引，获取对应的元素
             result = result + chs[random];
        }
        System.out.println(result);

        //3.随机抽取0~9的数字
        int random1 = r.nextInt(10)+1;
        //打印最终结果
         result = result + random1;
        System.out.println(result);


    }
}
