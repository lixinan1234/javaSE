package com.xinan.demo3;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/15 20:04
 */
public class fordemo4 {
    public static void main(String[] args) {
        /*
         * 需求：在实际开发中，如果要获取一个范围中的每一个数据时，会用到循环。
         * 但是此时，大多情况下，不会获取所以的数据，而是获取其中符合要求的数据。
         * 此时就需要循环和其他语句结合使用了。
         *
         * 比如；求1~100之间偶数的和
         * */

        //分析：1.获取1~100之间的每一个数
        int sum = 0;
        //开始条件：1
        //结束条件：100
        for (int i = 1; i <= 100; i++) {
            //2.累计求和，（先判断，再求和）
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
