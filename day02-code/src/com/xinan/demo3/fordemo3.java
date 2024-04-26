package com.xinan.demo3;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/15 19:46
 */
public class fordemo3 {
    public static void main(String[] args) {
        /*
         * 需求：在实际开发中，如果要获取一个范围中的每一个数据，也会用到循环。
         *比如：1~5求和
         */

        //分析：
        //1.循环1~5得到里面每一个数字
        //开始条件：1
        //结束条件：5

        //用来累加的
        int sum = 0;

        for (int i = 1; i <= 100 ; i++) {
//            System.out.println(i);
            //可以把得到的每一个数字累加到变量sum当中
            sum += i;
        }
        System.out.println(sum);
    }
}
