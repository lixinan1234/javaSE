package com.an.a01staticdemo1;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/21 14:49
 */
public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "阿伟老师";
        //1.创建两个学生对象
        Student s1 = new Student();
        s1.setName("李新安");
        s1.setAge(18);
        s1.setGender("男");
//        s1.teacherName = ("阿伟老师");

        s1.show();
        s1.study();

        Student s2 = new Student();
        s2.setName("廖乐乐");
        s2.setAge(18);
        s2.setGender("男");

        s2.show();
        s2.study();
        //
    }
}
