package com.lianxiti.text6;

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

    //线程1
    static ArrayList<Integer> list1 = new ArrayList<>();
    //线程2
    static ArrayList<Integer> list2 = new ArrayList<>();

    @Override
    public void run() {
        //1.循环
        while (true){
            //2.同步代码块
            synchronized (MyThread.class){
                //3.判断共享数据是否到了末尾，(到了末尾)
                if(list.size()==0){
                    if("抽奖箱1".equals(getName())){
                        int he = 0;
                        for (Integer integer : list1) {
                             he=integer+he;
                             he++;
                        }
                        Integer max1 = Collections.max(list1);
                        System.out.println("抽奖箱1"+list1+"  最大值是"+max1+"  一共是 "+he);
                    }else {
                        int he = 0;
                        for (Integer integer : list2) {
                            he=integer+he;
                            he++;
                        }
                        Integer max2 = Collections.max(list2);
                        System.out.println("抽奖箱1"+list2+"   最大值是"+max2+"  一共是 "+he);
                    }
                    break;
                }else {
                    //3.判断共享数据是否到了末尾，(没有到末尾，执行核心逻辑)
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
                    //System.out.println(getName()+"产生了一个"+prize+"元大奖");
                    if("抽奖箱1".equals(getName())){
                        list1.add(prize);
                    }else {
                        list2.add(prize);
                    }
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
