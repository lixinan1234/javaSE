package com.duotai.duotailianxi;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/3 15:14
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    //饲养狗
//    public void keepPet(Dog dog,String something){
//        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+dog.getColor()+"颜色的"+dog.getAge()+"岁的狗");
//        dog.eat(something);
//    }
//
//    //饲养猫
//    public void keepPet(cat cat,String something){
//        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+cat.getColor()+"颜色的"+cat.getAge()+"岁的狗");
//        cat.eat(something);
//    }

    //想要一个方法，能接收所有动物，包括猫，包括狗
    //方法的形参，可以写这些类的父类，Animal
    public void keepPet(animal a,String something){
        Dog d = (Dog)a;
        cat c = (cat)a;
       if(a instanceof Dog){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+d.getColor()+"颜色的"+d.getAge()+"岁的狗");
            d.eat(something);
        }else if(a instanceof cat){
           System.out.println("年龄为"+age+"岁的"+name+"养了一只"+c.getColor()+"颜色的"+c.getAge()+"岁的猫");
           c.eat(something);
       }
    }
}
