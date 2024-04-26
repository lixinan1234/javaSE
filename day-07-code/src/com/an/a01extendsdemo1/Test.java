package com.an.a01extendsdemo1;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/28 15:41
 */
public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法

        //1.创建布偶猫的对象
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        System.out.println("-----------------------------------");

        //2.创建哈士奇的对象
        Husky hu = new Husky();
        hu.breakHome();
        hu.drink();
        hu.eat();
        hu.lookHome();
    }
}
