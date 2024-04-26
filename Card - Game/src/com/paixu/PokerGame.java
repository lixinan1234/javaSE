package com.paixu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/12 16:35
 */
public class PokerGame {

    static HashMap<Integer, String> map = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();


    //牌盒：

    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A","2"};

        //序号：
        int serialNumber = 1;
        for (String n : number) {
            //n表示每一个数字
            for (String c : color) {
                //c依次表示每一种花色
                map.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        map.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;

        map.put(serialNumber, "大王");
        list.add(serialNumber);

        System.out.println(map);
        System.out.println(list);
    }

    public PokerGame() {

        //洗牌
        Collections.shuffle(list);

        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {

            int serialNumber = list.get(i);
            if (i <= 2) {
                lord.add(serialNumber);
                continue;
            }
            if (i%3==0){
                player1.add(serialNumber);
            }else if(i%3==1){
                player2.add(serialNumber);
            }else{
                player3.add(serialNumber);
            }

        }

        //看牌
        LookPoker("底牌",lord);
        LookPoker("玩家1",player1);
        LookPoker("玩家2",player2);
        LookPoker("玩家3",player3);

    }

    /*
参数1：玩家名字
参数2：牌的序号
 */
    private static void LookPoker(String name,TreeSet<Integer> ts){
        //遍历TreeSet集合中得到每一个序号，再拿着序号得到Map集合中去找真正的牌
        System.out.print(name + ": ");
        for (Integer serialNumber : ts) {
            String poker = map.get(serialNumber);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
