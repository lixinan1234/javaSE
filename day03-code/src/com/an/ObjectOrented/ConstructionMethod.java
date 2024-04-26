package com.an.ObjectOrented;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/10/29 13:58
 */
public class ConstructionMethod {
    private String name;
    private int age;

    //如果我们没有自己写任何构造方法
    //那么虚拟机就给我们加一个空参构造方法
    //无参构造
    public ConstructionMethod() {
        System.out.println("看我执行了吗");
    }

    //定义了一个有参构造
    public ConstructionMethod(String name,int age){
        this.name = name;
        this.age  = age;
    }

    //作用：给成员变量name进行赋值的
    public void setName(String name) {
        this.name = name;
    }
    //作用：对外提供name的属性
    public String getName() {
        return name;
    }


    //作用：给成员变量age进行赋值的
    public void setAge(int age){
        this.age = age;
    }
    //作用：对外提供age的属性(获取成员变量的值)
    public int getAge(){
        return age;
    }
}
