package Stream.终结方法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/15 21:16
 */
public class Stream1 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list, "赵云-34", "张飞-43", "关羽-54", "黄忠-70", "马超-30");

        //forEach 遍历
        list.stream().forEach(s -> System.out.println(s));

        //count 统计
        long count = list.stream().count();
        System.out.println(count);

        //toArray 收集流中的数据，放到数组中
        Object[] objects = list.stream().toArray();
        System.out.println(Arrays.toString(objects));

    }
}
