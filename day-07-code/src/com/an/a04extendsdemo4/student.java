package com.an.a04extendsdemo4;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/30 16:27
 */
public class student extends th {
    public student() {
        //子类构造方法中隐藏的super()去访问父类的无参构造
        super();
        System.out.println("子类的无参构造");
    }

    public student(String name,int age) {
        super(name,age);

    }
}
