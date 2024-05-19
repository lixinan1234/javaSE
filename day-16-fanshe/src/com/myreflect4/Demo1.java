package com.myreflect4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/17 16:15
 */
public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
           /*
       Class类中用于获取成员方法的方法
            Method[] getMethods()：返回所有公共成员方法对象的数组，包括继承的
            Method[] getDeclaredMethods()：返回所有成员方法对象的数组，不包括继承的
            Method getMethod(String name, Class<?>... parameterTypes) ：返回单个公共成员方法对象
            Method getDeclaredMethod(String name, Class<?>... parameterTypes)：返回单个成员方法对象


       Method类中用于创建对象的方法
            Object invoke(Object obj, Object... args)：运行方法
            参数一：用obj对象调用该方法
            参数二：调用方法的传递的参数（如果没有就不写）
            返回值：方法的返回值（如果没有就不写）

        获取方法的修饰符
        获取方法的名字
        获取方法的形参
        获取方法的返回值
        获取方法的抛出的异常

         */


        //1.创建Class的字节码文件对象
        Class clazz = Class.forName("com.myreflect4.Student");

        //2.获取里面所有的方法对象
        //返回所有公共成员方法对象的数组，包括继承的
        /*Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        //返回所有成员方法对象的数组，不包括继承的
        /*Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }*/

        //获取指定的单一方法
        Method m = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(m);

        //获取方法的修饰符
        int modifiers = m.getModifiers();
        System.out.println(modifiers);

        //方法运行
        /*Method类中用于创建对象的方法
        Object invoke(Object obj, Object... args)：运行方法
        参数一：用obj对象调用该方法
        参数二：调用方法的传递的参数（如果没有就不写）
        返回值：方法的返回值（如果没有就不写）*/
        Student s = new Student();
        m.setAccessible(true);
        //参数一s：表示方法的调用者
        //参数二"汉堡包"：表示在调用方法的时候传递的实际参数
        String result = (String) m.invoke(s, "汉堡包");
        System.out.println(result);

    }
}
