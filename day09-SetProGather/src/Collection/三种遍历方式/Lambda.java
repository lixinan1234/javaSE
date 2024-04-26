package Collection.三种遍历方式;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/30 14:15
 */
public class Lambda {
    public static void main(String[] args) {

        //1.创建集合并添加对象
        Collection<String> coll = new ArrayList<>();
        coll.add("an");
        coll.add("le");

        //2.利用匿名内部类表示集合的每一个数据
        coll.forEach(new Consumer<String>() {
            @Override
            //s依次表示集合中的每一位数据
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
