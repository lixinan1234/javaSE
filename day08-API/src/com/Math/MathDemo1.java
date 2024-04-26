package com.Math;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/11 11:02
 */
public class MathDemo1 {
    public static void main(String[] args) {
        //abs 获取参数的绝对值
        System.out.println(Math.abs(-88));//88


        //ceil 向上取整
        //进一法，往数轴的正方向进一
        System.out.println(Math.ceil(12.34));//13.0
        System.out.println(Math.ceil(-12.34));//-12.0


        //floor 向下取整
        //去尾法，向负无穷大方向获取最近的整数
        System.out.println(Math.floor(12.34));//12.0
        System.out.println(Math.floor(-12.34));//-13.0


        //round 四舍五入
        System.out.println(Math.round(3.4));//3
        System.out.println(Math.round(3.5));//4


        //max 获取两个int值中的较大值
        System.out.println(Math.max(4, 7));//7
        //min 获取两个int值中的较小值
        System.out.println(Math.min(4, 7));//4


        //pow 返回a的b次幂的值
        System.out.println(Math.pow(2, 3));//8.0
        System.out.println("----------------------");


        //random 返回double的随机数
        for (int i = 0; i < 5; i++) {
            System.out.println(Math.floor(Math.random() *100)+1);
            //Math.random() [0.0~1.0)
            //*100          [0.0~100.0)
            //floor         去掉了后面的小数
            //+1            [1.0~100.0)
        }


    }
}
