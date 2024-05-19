package com.myreflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/17 15:11
 */
public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
         /*
        Class类中用于获取构造方法的方法
            Constructor<?>[] getConstructors()                                返回所有公共构造方法对象的数组
            Constructor<?>[] getDeclaredConstructors()                        返回所有构造方法对象的数组
            Constructor<T> getConstructor(Class<?>... parameterTypes)         返回单个公共构造方法对象
            Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 返回单个构造方法对象


        Constructor类中用于创建对象的方法
            T newInstance(Object... initargs)                                 根据指定的构造方法创建对象
            setAccessible(boolean flag)                                       设置为true,表示取消访问检查
    */


        //1.获取字节码文件的对象
        Class clazz = Class.forName("com.myreflect2.Student");

        //2.获取构造方法
        /*Constructor[] cons1 = clazz.getConstructors();
        for (Constructor con : cons1) {
            System.out.println(con);
        }*/


        /*Constructor[] cons2 = clazz.getDeclaredConstructors();//返回所有构造方法对象的数组
        for (Constructor constructor : cons2) {
            System.out.println(constructor);
        }*/

        /*Constructor cons3 = clazz.getDeclaredConstructor();//获取单个的Student对象
        System.out.println(cons3);

        Constructor cons4 = clazz.getDeclaredConstructor(String.class);//获取单个构造方法对象
        System.out.println(cons4);

        Constructor cons5 = clazz.getDeclaredConstructor(int.class);//获取单个构造方法对象
        System.out.println(cons5);*/

        Constructor cons6 = clazz.getDeclaredConstructor(String.class,int.class);//获取单个构造方法对象
        System.out.println(cons6);

        Object stu = cons6.newInstance("张三", 23);
        System.out.println(stu);
    }
}
