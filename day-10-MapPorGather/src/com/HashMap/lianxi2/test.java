package com.HashMap.lianxi2;

import java.util.*;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/8 19:54
 */
public class test {
    public static void main(String[] args) {
        /*
        需求：某个班级80名学生，现在需要组成秋游活动
        班长提供了四个景点依次是（A,B,C,D）
        每个学生只能选择一个景点，请统计出最终哪个景点想去的人最多
         */

        //1.需要让同学们投票

        //定义一个数组，存储4个景点
        String[] arr = {"南昌","北京","南京","上海"};
        //利用随机数模拟80个同学的投票，并把投票的结果存储起来
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        //2.定义map集合，利用集合进行统计
        HashMap<String,Integer> hm = new HashMap<>();
        for (String name : list) {
            //判断当前景点在Map集合当中是否存在
            if(hm.containsKey(name)){
                //存在
                //先获取当前景点已经被投票的次数
                int count = hm.get(name);
                //表示当前景点又被投了一次
                count++;
                //把新的次数再次添加到集合中
                hm.put(name,count);
            }else {
                //不存在
                hm.put(name,1);
            }
        }

        System.out.println(hm);

        //3.求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if(count > max){
                max=count;
            }
        }
        System.out.println(max);

        //4.判断哪个景点的次数跟最大值一样，如果一样，打印出来
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if(count == max){
                System.out.println(entry.getKey());
            }
        }
    }
}
