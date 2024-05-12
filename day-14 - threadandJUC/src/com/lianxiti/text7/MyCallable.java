package com.lianxiti.text7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/12 21:18
 */
public class MyCallable implements Callable<Integer> {
    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxList = new ArrayList<>();
        //1.循环
        while (true) {
            //2.同步代码块
            synchronized (MyCallable.class) {
                //3.判断共享数据是否到了末尾，(到了末尾)
                if (list.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + boxList);
                    break;
                } else {
                    //3.判断共享数据是否到了末尾，(没有到末尾，执行核心逻辑)
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
                    //System.out.println(getName()+"产生了一个"+prize+"元大奖");
                    boxList.add(prize);
                }
            }
            Thread.sleep(200);
        }
        //把集合中的最大值返回
        if(boxList.size()==0){
            return null;
        }else {

            return Collections.max(boxList);
        }
    }
}
