package com.xinan.demo4;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/18 18:12
 */
public class JumpLoop {
    public static void main(String[] args) {
        //需求:小老虎吃五个包子，跳过第3个

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                //结束本次循环，继续下一次循环
                continue;
            }
            System.out.println("小老虎吃了" + i + "个包子");
        }

        System.out.println("--------------------------------");

        //需求:结束整个循环

        for (int x = 1; x <= 5; x++) {
            System.out.println("小老虎吃了" + x + "个包子");
            if(x==3){
                break;
            }
        }

    }
}
