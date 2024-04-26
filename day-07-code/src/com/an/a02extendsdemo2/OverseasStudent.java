package com.an.a02extendsdemo2;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/28 17:10
 */
public class OverseasStudent extends Person{
    public void lunch(){
        this.eat();
        this.drink();
    }

    @Override
    public void eat(){
        System.out.println("吃意大利面");
    }

    @Override
    public void drink(){
        System.out.println("喝凉水");
    }
}
