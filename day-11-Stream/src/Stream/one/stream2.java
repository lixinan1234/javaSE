package Stream.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/14 16:43
 */
public class stream2 {
    public static void main(String[] args) {
        //1.单列集合获取stream流
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
        //获取到一条流水线，并把集合中的数据放到流水线上
        //Stream<String> stream = list.stream();
        list.stream().forEach(s -> System.out.println(s));

        System.out.println("===================================");

        //2.创建双列集合获取stream流
        HashMap<String,Integer> hm = new HashMap<>();
        //添加数据
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);
        //获取stream流
        hm.entrySet().stream().forEach(s-> System.out.println(s));

        System.out.println("===================================");

        //3.创建数组获取stream流
        int[] array = {1,2,3,4,5,6};
        //获取stream流
        Arrays.stream(array).forEach(s -> System.out.println(s));
        System.out.println("===================================");

        //4.一堆零散的数据获取stream流
        Stream.of(1,2,3,4,5,6).forEach(s -> System.out.println(s));
    }
}
