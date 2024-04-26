package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**o'p
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/28 20:19
 */
public class Collection1 {
    public static void main(String[] args) {

        //创建一个集合
        Collection<String> coll = new ArrayList<>();

        //1.添加元素
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        //2.清空元素
        //coll.clear();

        //3.删除元素89
        coll.remove("aaa");
        System.out.println(coll);

        //4.判断元素是否存在
        boolean s = coll.contains("aaa");
        System.out.println(s);


    }
}
