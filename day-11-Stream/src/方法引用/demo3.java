package 方法引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/16 20:39
 */
public class demo3 {
    public static void main(String[] args) {
        /*
        方法引用（引用成员方法）
        格式：
            其他类：其他类对象：：方法名
            本类：this::方法名
            父类：super::方法名

        需求：
            集合中有一些名字，按照要求过滤数据
            数据："张无忌","张三丰","刘玄德","张翼德"
            要求：只要以张开头，而且名字有3个
         */

        //创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","张三丰","刘玄德","张翼德","张苞");
        //只要以张开头，而且名字有3个
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length()==3)
                .forEach(s -> System.out.println(s));

        System.out.println("====================================");

        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {

                return s.startsWith("张") &&s.length()==3;
            }
        }).forEach(s -> System.out.println(s));

        System.out.println("====================================");

        //方法引用（引用成员方法）
        list.stream().filter(new StringOperation()::stringJudge)
                .forEach(s -> System.out.println(s));
    }
}
