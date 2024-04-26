package TreeSet;

import java.util.TreeSet;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/6 21:00
 */
public class TreeSet1 {
    public static void main(String[] args) {
        /*
        需求：利用TreeSet存储整数并运行排序
         */

        //1.创建TreeSet的集合
        TreeSet<Integer> number = new TreeSet<>();
        number.add(2);
        number.add(6);
        number.add(4);
        number.add(9);

        //2.排序
        for (Integer s : number) {
            System.out.println(s);
        }
    }
}
