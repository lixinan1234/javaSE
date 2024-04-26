package com.an.a04extendsdemo5;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/30 17:13
 */
public class Test {
    public static void main(String[] args) {
        Employee e = new Employee("01","李新安",10000);
        e.eat();
        e.work();
        System.out.println(e.getName()+", "+e.getId()+", "+e.getMoney());


        Cook c = new Cook();
        c.setName("lixinan");
        c.setId("01");
        c.setMoney(8000);
        c.work();
        c.eat();
        System.out.println(c.getName()+", "+c.getId()+", "+c.getMoney());
    }
}
