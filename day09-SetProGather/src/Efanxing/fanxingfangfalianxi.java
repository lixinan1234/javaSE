package Efanxing;

import java.util.ArrayList;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/2 15:44
 */
public class fanxingfangfalianxi {
    public static void main(String[] args) {
        /*
        定义一个工具类：ListUtil
        类中定义一个静态方法addAll，用来添加多个集合元素
         */

        ArrayList<String> list = new ArrayList<>();

        ListUtil.addAll(list,"aaa","bbb","ccc","ddd");
        System.out.println(list);
    }
}
