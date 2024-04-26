package 方法引用.练习;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/17 10:34
 */
public class test2 {
    public static void main(String[] args) {
        /*
        需求：创建集合添加学生对象
             学生对象属性：name,age

        需求：获取姓名并放到数组中去
             使用方法引用完成
         */

        //1.创建集合并添加元素
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        //2.获取姓名并放到数组中去
        String[] arr = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).toArray(String[]::new);

        System.out.println(Arrays.toString(arr));


        //使用方法引用完成
        String[] arr2 = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr2));


    }
}
