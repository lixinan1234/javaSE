package com.an.ObjectOrented;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/10/29 14:42
 */
public class Student {
    private String name;
    private int age;
    private double height;

    //定义一个无参构造
    public Student(){

    }

    //定义一个有参构造
    public Student(String name,int age,double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
}
