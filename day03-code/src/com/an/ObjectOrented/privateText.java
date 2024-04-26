package com.an.ObjectOrented;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/10/29 11:26
 */
public class privateText {
    public static void main(String[] args) {
        //创建男朋友的对象
        Privategjz p1 = new Privategjz();
        p1.setSname("李新安");
        p1.setPiqi("性格温顺");
        p1.setAge(-18);
        //获取
        System.out.println(p1.getSname());
        System.out.println(p1.getPiqi());
        System.out.println(p1.getAge());

        p1.sleep();
        p1.eat();
    }
}
