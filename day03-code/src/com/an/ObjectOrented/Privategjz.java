package com.an.ObjectOrented;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/10/29 11:26
 */
public class Privategjz {
    private String sname;
    private int age;
    private String piqi;

    //作用：给成员变量name进行赋值的
    public void setSname(String sname) {
        this.sname = sname;
    }

    //作用：对外提供sname的属性
    public String getSname() {
        return sname;
    }

    //age
    //setAge:给成员变量age进行赋值的
    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("年龄不适合你");
        }
    }

    //getAge:对外提供成员变量age的值
    public int getAge() {
        return age;
    }


    //piqi
    //setPiqi:给成员变量age进行赋值的
    public void setPiqi(String piqi) {
        this.piqi = piqi;
    }

    //getPiqi:对外提供成员变量age的值
    public String getPiqi() {
        return piqi;
    }


    //行为
    public void sleep() {
        System.out.println("男朋友在睡觉");
    }

    public void eat() {
        System.out.println("女朋友在吃饭");
    }
}
