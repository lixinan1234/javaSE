package com.paixu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/11 22:32
 */
public class PokerGame {

    static ArrayList<String> list = new ArrayList<>();

    //创建一个集合，用来添加牌的价值
    static HashMap<String, Integer> hm = new HashMap<>();

    //静态代码块
    //特点：随着类的加载而加载的，而且只执行一次
    static {
        //准备牌

        //"♦","♣","♥","♠"
        //"1","2","3","4","5","6","7","8","9","10","J","Q","K"
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //牌盒
        //比如:♦3 ♦5 ♥7

        for (String c : color) {
            //c依次表示每一种花色
            for (String n : number) {
                //n表示每一个数字
                list.add(c + n);
            }
        }
        list.add(" 小王");
        list.add(" 大王");


        //指定牌的价值
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("小王", 20);
        hm.put("大王", 100);
    }


    public PokerGame() {

        //1.洗牌
        Collections.shuffle(list);
        System.out.println("全部牌：" + list);
        //2.发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        //遍历牌盒得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            //i:索引
            String poker = list.get(i);
            //发底牌
            if (i <= 2) {
                lord.add(poker);
                continue;
            }

            //给三个玩家轮流发牌
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }

        }


        //排序
        order(lord);
        order(player1);
        order(player2   );
        order(player3);

        //3.看牌
        lookPoker("底牌",lord);
        lookPoker("李新安",player1);
        lookPoker("廖乐乐",player2);
        lookPoker("祝英豪",player3);
    }

    /*
    参数1：玩家名字
    参数2：每位玩家的牌
     */
    public void lookPoker(String name,ArrayList<String> list){
        System.out.print(name+": ");
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }

    //利用牌的价值进行排序
    //参数：集合
    public void order(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //1.计算O1的花色价值
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);

                //2.计算O2的花色价值
                String color2 = o1.substring(0, 1);
                int value2 = getValue(o2);

                //3.比较o1和o2的价值
                int i = value1 - value2;
                return i ==0 ? color1.compareTo(color2) :i;
            }
        });

    }


    //计算牌的价值
    //参数:牌
    //返回值：价值
    public int getValue(String poker) {
        //获取牌上的数字
        String number = poker.substring(1);
        //拿着数字到map集合中判断是否存在
        if (hm.containsKey(number)) {
            //存在，获取价值
            return hm.get(number);
        } else {
            //不存在，类型转换
            return Integer.parseInt(number);
        }
    }

}
