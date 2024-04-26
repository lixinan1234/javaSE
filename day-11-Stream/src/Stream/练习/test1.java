package Stream.练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/15 22:08
 */
public class test1 {
    public static void main(String[] args) {
        /*
        定义一个集合，并添加一些整数1，2，3，4，5，6，7，8，9，10
        过滤奇数，留下偶数
        并把结果保存起来
         */

        //创建一个集合
        ArrayList<Integer> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        //过滤
        List<Integer> collect = list.stream()
                .filter(s -> s % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
