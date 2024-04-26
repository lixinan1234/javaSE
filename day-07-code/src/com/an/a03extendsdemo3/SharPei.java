package com.an.a03extendsdemo3;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/29 17:02
 */
public class SharPei extends Animal{

    @Override
    public void eat() {
        super.eat();//吃狗粮
        System.out.println("狗在啃骨头");
    }
}
