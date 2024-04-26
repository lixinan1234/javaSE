package TreeSet.dierzhongfangfa;

import java.util.TreeSet;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/7 14:40
 */
public class TreeSet2 {
    public static void main(String[] args) {
        /*
       需求：创建5个学生对象
       属性：（姓名，年龄，语文成绩，数学成绩，英语成绩）
       按照总分从高到低输出到控制台
       如果总分一样，按照语文成绩进行排序
       如果语文成绩一样，按照数学成绩进行排序
       如果数学成绩一样，按按英语成绩进行排序
       如果英语成绩一样，按照年龄成绩进行排序
       如果年龄一样，按照姓名首字母进行排序
       如果都一样就不存
         */

        //1.创建五个学生对象
        Student s1 = new Student("zhangsan",23,99,89,88);
        Student s2 = new Student("liaolele",24,100,99,100);
        Student s3 = new Student("tangzixuan",21,98,78,67);
        Student s4 = new Student("caolego",25,78,98,80);
        Student s5= new Student("caolego",25,78,98,80);
        //2.创建一个集合并添加学生对象
        TreeSet<Student> str = new TreeSet<>();
        str.add(s1);
        str.add(s2);
        str.add(s3);
        str.add(s4);
        str.add(s5);
        //4.遍历输出
        for (Student s : str) {
            System.out.println(s);
        }


    }
}
