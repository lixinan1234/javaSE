package com.jieko;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/6 14:44
 */
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("小狗",2);
        System.out.println(d.getName()+" , "+d.getAge());
        d.eat();
        d.swim();
    }
}
