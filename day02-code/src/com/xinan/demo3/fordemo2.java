package com.xinan.demo3;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/15 19:36
 */
public class fordemo2 {
    public static void main(String[] args) {
        /*
         * 在实际开发中，需要重复执行的代码，会选择循环实现
         * 比如：玩游戏的时候，如果网不好经常会断线重连。
         * 那么断线重连这个业务逻辑就需要重复执行。
         * 假设现在公司需求，断线重连的业务逻辑最多写5次
         * 请用代码实现
         * */

        //分析；循环次数5
        //开始条件：1
        //结束条件：5
        for (int i = 1; i <= 5; i++) {
            System.out.println("第" + i + "次执行断线重连的业务逻辑");
        }
    }
}
