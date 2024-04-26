package com.object;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/12 19:49
 */
public class ObjectDemo1 {
    public static void main(String[] args) {

        //1.toString 返回对象的字符串表示形式
        Object obj = new Object();
        String s = obj.toString();
        System.out.println(s);

        Student sut1 = new Student("zhangsan",23);

        System.out.println(sut1);

        //equals 比较两个对象内部的属性值
        Student sut2 = new Student("zhangsan",23);
        Student sut3 = new Student("zhangsan",23);

        boolean equals = sut2.equals(sut3);
        System.out.println(equals);


    }
}
