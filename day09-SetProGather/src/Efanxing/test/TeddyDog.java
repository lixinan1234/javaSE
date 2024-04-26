package Efanxing.test;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/2 16:42
 */
public class TeddyDog extends Dag{
    @Override
    public void eat() {
        System.out.println("一个只叫做"+getName()+"的，"+getAge()+"岁的泰迪，正在吃骨头，边吃边蹭");
    }
}
