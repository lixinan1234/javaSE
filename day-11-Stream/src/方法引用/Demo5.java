package 方法引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/17 9:48
 */
public class Demo5 {
    public static void main(String[] args) {
        /*
        方法引用（类名引用成员方法）
        格式： 类名：：成员方法

        需求：集合里面一些字符串，要求变成大写
         */

        //1.创建集合并添加数据
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa","bbb","ccc","ddd");
        //2.变成大写进行输出
        list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                //toUpperCase转成大写
                return s.toUpperCase();
            }
        }).forEach(s -> System.out.println(s));



        //方法引用（类名引用成员方法）变成大写进行输出
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}
