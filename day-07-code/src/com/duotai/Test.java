package com.duotai;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/3 10:54
 */
public class Test {
    public static void main(String[] args) {
        //创建三个对象，并调用register方法
        student s = new student();
        s.setName("李新安");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("戴维");
        t.setAge(36);

        Administrator a = new Administrator();
        a.setName("AnAn");
        a.setAge(18);

        register(s);
        register(a);
        register(t);
    }



    //这个方法既能接收学生，又能接收老师，还能接收管理员
    //只能把参数写成这三个类型的父类
    public static void register(person p){
        p.show();
    }
}
