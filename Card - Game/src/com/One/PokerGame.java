package com.One;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/11 22:32
 */
public class PokerGame {

    static ArrayList<String> list = new ArrayList<>();

    //静态代码块
    //特点：随着类的加载而加载的，而且只执行一次
    static {
        //准备牌

        //"♦","♣","♥","♠"
        //"1","2","3","4","5","6","7","8","9","10","J","Q","K"
        String[] color = {"♦","♣","♥","♠"};
        String[] number = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};

        //牌盒
        //比如:♦3 ♦5 ♥7

        for (String c : color) {
            //c依次表示每一种花色
            for (String n : number) {
                //n表示每一个数字
                list.add(c+n);
            }
        }
        list.add("小王");
        list.add("大王");
    }



    public PokerGame(){

        //1.洗牌
        Collections.shuffle(list);
        System.out.println("全部牌："+list);
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
            if(i<=2){
                lord.add(poker);
                continue;
            }
            
            //给三个玩家轮流发牌
            if(i%3==0){
                 player1.add(poker);
            }else if(i%3==1){
                player2.add(poker);
            }else {
                player3.add(poker);
            }

        }

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
}



