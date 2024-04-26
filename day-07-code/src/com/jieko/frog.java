package com.jieko;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/6 14:39
 */
public class frog extends Animal implements Swim{

    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("青蛙在游泳");
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }
}
