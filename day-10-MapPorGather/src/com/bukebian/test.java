package com.bukebian;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/13 21:51
 */
public class test {
    public static void main(String[] args) {
        //创建不可变List的集合
        List<String> list = List.of("李新安", "廖乐乐");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        //遍历
        System.out.println("================================");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("================================");
        //list.remove("李新安");//不可添加删除

    }


}
