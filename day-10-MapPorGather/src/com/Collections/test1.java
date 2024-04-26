package com.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/10 22:10
 */
public class test1 {
    public static void main(String[] args) {
        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //2.批量添加元素
        Collections.addAll(list,"abc","123","ajdw","lixinan","liaolele","No");
        //3.打印集合
        System.out.println(list);

        //4.shuffle打乱
        Collections.shuffle(list);
        System.out.println(list);
    }
}
