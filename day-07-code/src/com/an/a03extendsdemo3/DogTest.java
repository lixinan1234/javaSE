package com.an.a03extendsdemo3;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/29 17:10
 */
public class DogTest {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.breakHome();
        h.lookHome();


        ChineseDog c = new ChineseDog();
        c.eat();
        c.drink();
        c.lookHome();

        SharPei s = new SharPei();
        s.eat();
        s.drink();
        s.lookHome();
    }
}
