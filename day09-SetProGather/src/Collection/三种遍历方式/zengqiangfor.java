package Collection.三种遍历方式;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/30 14:02
 */
public class zengqiangfor {
    public static void main(String[] args) {
        //1.创建一个集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        //2.遍历集合
        for (String s : coll){
            System.out.println(s);
        }



    }
}
