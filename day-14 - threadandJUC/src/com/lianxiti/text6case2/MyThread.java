package com.lianxiti.text6case2;

import java.util.ArrayList;
import java.util.Collections;

/**
* @author:lixinan
* @email:2489460735@qq.com
* @desc:
* @datetime: 2024/5/12 15:29
*/
public class MyThread extends Thread{

   ArrayList<Integer> list;

   public MyThread(ArrayList<Integer> list) {
       this.list = list;
   }

   @Override
   public void run() {
       ArrayList<Integer> boxList = new ArrayList<>();
       //1.循环
       while (true){
           //2.同步代码块
           synchronized (MyThread.class){
               //3.判断共享数据是否到了末尾，(到了末尾)
               if(list.size()==0){
                   System.out.println(getName()+boxList);
                   break;
               }else {
                   //3.判断共享数据是否到了末尾，(没有到末尾，执行核心逻辑)
                   Collections.shuffle(list);
                   Integer prize = list.remove(0);
                   //System.out.println(getName()+"产生了一个"+prize+"元大奖");
                   boxList.add(prize);
               }
           }
           try {
               Thread.sleep(200);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
   }
}
