package com.lianxiti.text4case1;

import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/12 14:43
 */
public class MyThread extends Thread {

    //共享数据
    //100块，分成3个包
    static int money = 100;
    static int count = 3;

    //最小的中奖金额
    static final int MIN = 1;

    @Override
    public void run() {
         /*
        1.同步代码块（同步方法）
        2.判断共享数据是否到了末尾，(到了末尾)
        3.判断共享数据是否到了末尾，(没有到末尾，执行核心逻辑)
        */

        //1.同步代码块（同步方法）
        synchronized (MyThread.class) {
            //2.判断共享数据是否到了末尾，(到了末尾)
            if (count == 0) {
                System.out.println(getName() + "没有抢到红包！");
            } else {
                //3.判断共享数据是否到了末尾，(没有到末尾，执行核心逻辑)
                //定义一个变量，表示中奖金额
                double prize = 0;
                if (count == 1) {
                    //表示此时是最后一个红包
                    //就无需随机，剩余所有都是中奖金额
                    prize = money;
                } else {
                    //表示第一次，第二次（随机）
                    Random r = new Random();
                    //100 元   3个包
                    //第一个红包：99.98
                    //100 - (3-1) * 0.01
                    int bounds = money - (count - 1) * MIN;
                    prize = r.nextInt(bounds);
                    if(prize<MIN){
                        prize=MIN;
                    }
                }
                //从money当中，去掉当前中奖的金额
                money = (int) (money - prize);
                //红包的个数-1
                count--;
                //本次红包的信息进行打印
                System.out.println(getName() + "抢到了" + prize + "元");
            }
        }
    }
}
