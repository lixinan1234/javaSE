package com.duotai.duotailianxi;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/3 14:40
 */
public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法
//        Person p = new Person("老王",30);
//        Dog d = new Dog(2,"黑");
//        p.keepPet(d,"屎");
//
//        System.out.println("-------------------------------");
//
//        Person p2 = new Person("老李",25);
//        cat c = new cat(3,"灰");
//        p2.keepPet(c,"鱼");

        //创建饲养员的对象
        Person p1 = new Person("老王",30);
        Dog d = new Dog(2,"黑");
        cat c = new cat(3,"灰");
        p1.keepPet(d,"屎");
        p1.keepPet(c,"鱼");
    }
}
