package 方法引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/16 20:26
 */
public class demo2 {
    public static void main(String[] args) {
        /*
        方法引用（引用静态方法）
        格式：类：：方法名

        需求：
        集合中有以下数字，要求把他们都变成int类型
        "3","7","1","5","9","8","0"
         */

        //1.创建集合并添加元素
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"3","7","1","5","9","8","0");
        //2.把他们对变成int类型
        list1.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int i = Integer.parseInt(s);
                return i;
            }
        }).forEach(s-> System.out.println(s));


        //方法引用（引用静态方法）
        list1.stream().map(Integer::parseInt).forEach(s-> System.out.println(s));

    }
}
