package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/6 19:34
 */
public class Set1 {
    public static void main(String[] args) {

        //创建一个Set集合
        Set<String> str = new HashSet<>();
        str.add("aaa");
        str.add("bbb");
        str.add("ccc");

        //迭代器遍历
        Iterator<String> it = str.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("-------------------------");

        //增强for遍历
        for (String s : str) {
            System.out.println(s);
        }

        System.out.println("------------------------");

        //Lambda表达式
        str.forEach((String s)-> System.out.println(s));
    }
}
