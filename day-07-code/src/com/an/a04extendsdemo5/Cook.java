package com.an.a04extendsdemo5;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/30 17:08
 */
public class Cook extends Manager{

    public Cook() {
    }

    public Cook(String id, String name, double money) {
        super(id, name, money);
    }

       @Override
    public void work(){
        System.out.println("厨师在炒菜");
    }
}
