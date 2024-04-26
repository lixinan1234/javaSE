package Stream.中间方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/15 20:57
 */
public class Stream2 {
    public static void main(String[] args) {
        //创建两个集合
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"赵云","赵云","赵云","张飞","关羽","黄忠","马超","关平","刘备");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"曹操","曹丕");


        //distinct  去重
        list1.stream().distinct().forEach(s -> System.out.println(s));

        System.out.println("==========================================");

        //concat   合并
        Stream.concat(list1.stream(),list2.stream()).forEach(s -> System.out.println(s));
    }
}
