package Stream.终结方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/15 21:31
 */
public class Stream2 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list, "赵云-男-34", "张飞-女-43", "关羽-男-54", "黄忠-男-70", "马超-女-30");

        //搜集list集合元素
        //需求：
        //我要把所有的男性收集起来
        List<String> collect = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(collect);


        //收集到map集合
        Map<String, Integer> map1 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(map1);

    }
}
