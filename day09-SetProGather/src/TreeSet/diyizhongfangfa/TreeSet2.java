package TreeSet.diyizhongfangfa;

import java.util.TreeSet;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/6 21:14
 */
public class TreeSet2 {
    public static void main(String[] args) {
        /*
        需求：创建TreeSet对象，并添加3个学生对象。
        学生对象属性：姓名，年龄。
        要求按照学生的年龄进行排序。
        同年龄按照姓名字母排列
        同姓名，同龄认为就是同一个人
         */

        //1.创建三个学生对象
        TreeSetStudent s1 = new TreeSetStudent("liaolele",18);
        TreeSetStudent s2 = new TreeSetStudent("lixinan",19);
        TreeSetStudent s3 = new TreeSetStudent("tangzixuan",15);
        TreeSetStudent s4 = new TreeSetStudent("tangzixuan",20);

        //2.创建集合
        TreeSet<TreeSetStudent> str = new TreeSet<>();
        str.add(s1);
        str.add(s2);
        str.add(s3);
        str.add(s4);

       //打印集合
        System.out.println(str);
    }
}