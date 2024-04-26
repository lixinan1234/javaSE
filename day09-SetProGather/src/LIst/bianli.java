package LIst;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/30 15:19
 */
public class bianli {
    public static void main(String[] args) {
        /*

        五种遍历方法

         */

        //创建一个集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器遍历
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            System.out.println(s);
//        }


        //2.增强for遍历
//        for (String s : list) {
//            System.out.println(s);
//        }

        //3.Lambda表达式遍历
//        list.forEach(( s)-> System.out.println(s));


        //4.普通for遍历
//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            System.out.println(s);
//
//        }

        //5.列表迭代器遍历
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            String next = it.next();
            if("bbb".equals(next)){
                it.add("xxx");
            }
        }

        System.out.println(list);
    }
}
