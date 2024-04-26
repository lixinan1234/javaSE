package com.chouxiang;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/6 14:04
 */
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("小黄",2);
        System.out.println(d.getName()+", "+d.getAge());
        d.eat();
        d.drink();

        frog f = new frog("小绿",1);
        Sheep s = new Sheep("小白",3);
    }
}
