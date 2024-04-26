package com.object;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/12 21:19
 */
public class ObjectDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException {

        //clone  克隆

        //1.创建一个对象
        int[] data = {1,2,3,4,5,6,7,8,9};
        User u1 = new User(1,"zhangsan","123456","girl1",data);

        //2.克隆对象
        User u2 = (User) u1.clone();
        System.out.println(u1);
        System.out.println(u2);

    }
}
