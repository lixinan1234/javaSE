package com.xinan.demo3;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/16 19:27
 */
public class Whiledemo1 {
    public static void main(String[] args) {
        /*需求：
         * 世界最高山峰珠穆拉玛峰（8844.43米=8844430毫米）
         * 假如我有一张足够大的纸，它的厚度为0.1毫米。
         *请问我折几次，才能有珠穆拉玛峰的高度
         * */

        //分析：折叠纸张：每折一次就是原先的两倍
        //1.定义一个变量来记录山峰的高度
        double height = 8844430;
        //2.定义一个变量来记录纸张的初始厚度
        double paper = 0.1;
        //3.定义一个变量用来统计次数
        int count = 0;
        //4.循环折叠纸张，只要纸张的厚度小于山峰的高度，那么循环就继续
        //每折叠一次，统计次数就要++

        while (paper < height) {
            //折叠纸张
            paper = paper * 2;
            //折叠一次，就++一次
            count++;
        }
        //当循环结束后打印num
        System.out.println(count);
    }
}
