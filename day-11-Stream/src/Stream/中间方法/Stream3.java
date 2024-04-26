package Stream.中间方法;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/15 20:57
 */
public class Stream3 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list,"赵云-34","张飞-43","关羽-54","黄忠-70","马超-30");

        //需求：只获取里面的年龄并打印
        // split是切割一半，前后是数组形式的
        //Integer.parseInt是转换int类型的
        list.stream().map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.println(s));
    }
}
