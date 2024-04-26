package Efanxing.test;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/2 16:36
 */
public class persianCat extends Cat{

    @Override
    public void eat() {
        System.out.println("一个只叫做"+getName()+"的，"+getAge()+"岁的波斯猫，正在吃饼干");
    }
}
