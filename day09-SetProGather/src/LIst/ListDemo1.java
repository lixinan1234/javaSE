package LIst;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/30 14:38
 */
public class ListDemo1 {
    public static void main(String[] args) {

        //1.创建一个集合
        List<String> list = new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //3.指定索引位置插入指定元素
        list.add(1,"AnAn");

        //4.修改指定的索引元素，返回被修改的元素
        list.set(2,"LeLe");

        //5.返回指定的元素
        String s = list.get(2);
        System.out.println(s);

        //3.打印集合
        System.out.println(list);
    }
}
