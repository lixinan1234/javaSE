package Stream.中间方法;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/15 20:27
 */
public class Stream1 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加数据
        Collections.addAll(list,"赵云","张飞","关羽","黄忠","马超","关平","刘备");

        //filter  过滤 把开头是张的留下，其余不要
        list.stream().filter(s -> s.startsWith("关")).forEach(s -> System.out.println(s));

        System.out.println("========================================");

        //limit获取前几个元素
        list.stream()
                .limit(3)
                .forEach(s -> System.out.println(s));

        System.out.println("=========================================");

        //skip跳过前面几个元素
        list.stream()
                .skip(3)
                .forEach(s -> System.out.println(s));

        System.out.println("==============================");

        //课堂练习：获取"黄忠","马超","关平"。
        list.stream().skip(3).limit(3).forEach(s -> System.out.println(s));



    }
}
