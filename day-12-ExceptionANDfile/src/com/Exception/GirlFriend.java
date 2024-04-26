package com.Exception;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/18 19:50
 */
public class GirlFriend {
    private String name;
    private int age;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     * @param name
     */
    public String getName(String name) {
        return this.name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        int len = name.length();
        if(len<3||len>10){
            throw new NameFormatException(name+"格式有误，长度应该为：3~10");
        }

        this.name = name;
    }

    /**
     * 获取
     * @return age
     * @param age
     */
    public int getAge(int age) {
        return this.age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        if(age>40||age<18){
            throw new AgeOutOfBoundsException(age+"超出范围");
        }
        this.age = age;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + "}";
    }
}
