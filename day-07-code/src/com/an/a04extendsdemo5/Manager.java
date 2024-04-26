package com.an.a04extendsdemo5;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/30 17:01
 */
public class Manager extends Employee{

    private double bouns;


    //空参构造
    public Manager() {
    }

    //带全部参数的构造
    //父类 + 子类
    public Manager(String id, String name, double money) {
        super(id, name, money);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }


    @Override
    public void  work(){
        System.out.println("经理在管理其他人");
    }
}
