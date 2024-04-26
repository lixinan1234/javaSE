package Efanxing;

import java.util.ArrayList;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/2 15:47
 */
public class ListUtil {
    private ListUtil(){

    }

    //类中定义一个静态方法addAll，用来添加多个集合元素
    public static<E> void addAll(ArrayList<E> list,E...e){
        for (E element : e) {
            list.add(element);
        }
    }
}
