package 方法引用;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/16 20:02
 */
public class one {
    public static void main(String[] args) {
        //需求：创建一个数组，进行倒序排序
        Integer[] arr = {3,5,6,2,4,1};
        //匿名内部类
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        //lambda表达式
        Arrays.sort(arr, (Integer o1, Integer o2)-> {
                    return o2-o1;
                }
        );
        //lambda表达式简化格式
        Arrays.sort(arr, (o1,  o2)-> o2-o1);

        //方法的引用
        Arrays.sort(arr,one::subtraction);
        System.out.println(Arrays.toString(arr));
    }

    public static int subtraction(int num1,int num2){
        return num2 - num1;
    }
}
