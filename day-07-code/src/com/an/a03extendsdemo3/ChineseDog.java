package com.an.a03extendsdemo3;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/29 17:07
 */
public class ChineseDog  extends Animal{

    //父类中的方法不难满足我们的需求了，所以需要进行重写

    @Override
    public void eat() {
        super.eat();
        System.out.println("吃剩饭");
    }
}
