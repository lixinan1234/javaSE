package Efanxing.test;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/2 16:40
 */
public class LiHuaCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一个只叫做"+getName()+"的，"+getAge()+"岁的狸花猫，正在吃鱼");
    }
}
