package com.an.a04extendsdemo5;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/30 16:55
 */
public class Employee {
    private String id;
    private String name;
    private double money;

    public Employee() {
    }

    public Employee(String id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //工作
    public void work(){
        System.out.println("员工在工作");
    }

    //吃米饭
    public void eat(){
        System.out.println("吃米饭");
    }

}
