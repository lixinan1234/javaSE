package com.an.ObjectOrented;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/10/29 10:26
 */
public class SimpleExerciseText {
    public static void main(String[] args) {
        //创建男朋友的对象
        SimpleExercise p1 = new SimpleExercise();
        p1.sname = "lxa";
        p1.piqi = "性格温柔";
        p1.age = 18;
        p1.sg = 175;
        //获取
        System.out.println(p1.sname);
        System.out.println(p1.piqi);
        System.out.println(p1.age);
        System.out.println(p1.sg);

        p1.sleep();
        p1.eat();

        System.out.println("===============================");

        //创建第二个男朋友的对象
        SimpleExercise p2 = new SimpleExercise();
        p2.sname = "lll";
        p2.sg = 178;
        p2.age = 18;
        p2.piqi = "性格温顺";

        System.out.println(p2.sname);
        System.out.println(p2.piqi);
        System.out.println(p2.age);
        System.out.println(p2.sg);

        p2.sleep();
        p2.eat();

    }

}