package com.xinan.demo2;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/14 21:48
 */
public class IfThirdFormat3 {
    public static void main(String[] args) {
         /*需求：
    汽车无人驾驶会涉及到大量的判断
    当汽车行驶的时候遇到红绿灯，就会进行判断
    如果红灯亮，就停止
    如果黄灯亮，就减速
    如果绿灯亮，就前行
    */

        //1.定义三个变量表示灯的状态
        //true 亮 false 灭
        boolean RedLight = true;
        boolean GreenLight = false;
        boolean YellowLight = false;
        //2.如果红灯亮，就停止
        //  如果黄灯亮，就减速
        //  如果绿灯亮，就前行
        if(RedLight){
            System.out.println("Stop!!!!");
        }else if(GreenLight){
            System.out.println("Retard!!!!");
        }else  if(YellowLight){
            System.out.println("GO!!!!");
        }
    }

}
