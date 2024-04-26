package Collection.三种遍历方式;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/30 13:29
 */
public class diedaiqi {
    public static void main(String[] args) {
        //迭代器遍历相关的三种方法

        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2.获取迭代器的对象
        //默认指向集合的0索引处
        Iterator<String> it = coll.iterator();

        //3.利用循环不断的去获取集合中的每一个元素
        while (it.hasNext()){
            //4.获取元素并移动指针
            String s = it.next();
            System.out.println(s);
        }
    }
}
