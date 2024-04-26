package com.jieko;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/6 14:41
 */
public class Dog extends Animal implements Swim{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("狗在吃狗刨");
    }

    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }
}
