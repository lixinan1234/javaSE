package Stream.练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/15 22:30
 */
public class test2 {
    public static void main(String[] args) {
        /*
        创建一个ArrayList集合，并添加以下字符串，字符串中前面的姓名，后面是年龄
        "zhangsan,23",
        "lisi,24",
        "wangwu,25"
        保留年龄大于等于24的人，并将结果收集到Map集合中，姓名为键，年龄为值。
         */

        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list,"zhangsan,23", "lisi,24", "wangwu,25");

        Map<String, Integer> collect = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) <= 24)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])));
        System.out.println(collect);

    }
}
