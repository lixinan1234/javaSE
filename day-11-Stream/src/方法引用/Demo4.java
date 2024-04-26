package 方法引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/16 21:16
 */
public class Demo4 {
    public static void main(String[] args) {
        /*
        方法引用（引用构造方法）
        格式：
            类名：：new
        目的：
            创建这个类的对象

         需求：
               集合里面存储姓名和年龄，要求封装成Student对象并收集到list集合中
         */

        //1.创建集合并添加数据
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "张三丰,20", "刘玄德,50", "张翼德,45", "张苞,25");
        //2.要求封装成Student对象并收集到list集合中
        List<Student> newList = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String[] arr = s.split(",");
                String name = arr[0];
                int age = Integer.parseInt(arr[1]);
                return new Student(name, age);
            }
        }).collect(Collectors.toList());

        System.out.println(newList);





        //方法引用（引用构造方法）
        List<Student> newList2 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
