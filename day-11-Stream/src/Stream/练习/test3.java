package Stream.练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/16 9:07
 */
public class test3 {
    public static void main(String[] args) {
        /*
        现有两个ArrayList集合，分别存储6名男演员的名字和年龄和6名女演员的名字和姓名
        姓名和年龄用,号隔开。
        要求完成如下的操作：
        1.男演员只要名字为3个字的前两个人
        2.女演员只要姓杨的，并且不要第一个
        3.把过滤的男演员姓名和女演员的姓名合并到一起
        4.将上一步的演员姓名封装成Actor对象
        5.将所有演员对象都保存到list集合
        备注：演员类：Actor,属性有：name,age
         */

        //创建两个集合并添加数据
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"刘玄德,18","赵子龙,19","黄忠,18","关羽,18","张飞,18","马超,18");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"黄月英,18","小乔,19","大桥,18","杨尚香,18","杨琛,18","关银屏,18");
        //1.男演员只要名字为3个字的前两个人
        Stream<String> stream2 = list1.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);

        //2.女演员只要姓杨的，并且不要第一个
        Stream<String> stream1 = list2.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);


        //3.把过滤的男演员姓名和女演员的姓名合并到一起
        //4.将上一步的演员姓名封装成Actor对象
        //5.将所有演员对象都保存到list集合
        /*
        Stream.concat(stream1,stream2).map(new Function<String, Actor>() {

            @Override
            public Actor apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Actor(name,age);
            }
        }).forEach(s -> System.out.println(s));
         */

        //使用labdam表达式
        List<Actor> collect = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
