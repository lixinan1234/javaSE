package 方法引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/17 10:10
 */
public class Demo6 {
    public static void main(String[] args) {
        /*
        方法引用（数组的构造方法）
        格式：数据类型[]::new
        目的：创建一个指定的类型的数组
        需求：集合存储一些整数，收集到数组当中
         */

        //1.创建集合并添加元素
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,1,2,3,4,5,6,7);
        //2.集合存储一些整数，收集到数组当中
        Integer[] arr = list1.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });



        //方法引用（数组的构造方法）
        Integer[] arr2 = list1.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr2));
    }
}
