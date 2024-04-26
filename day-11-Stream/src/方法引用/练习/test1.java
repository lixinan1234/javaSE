package 方法引用.练习;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/17 10:24
 */
public class test1 {
    public static void main(String[] args) {
        /*
        需求：集合中存储一些字符串的数据，比如：张三，23
             收集到Student 类型的数组当中
         */

        //1.创建集合并添加数据
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "张三丰,20", "刘玄德,50", "张翼德,45", "张苞,25");
        //2.收集到Student 类型的数组当中
        Student[] students = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(students));
    }
}
