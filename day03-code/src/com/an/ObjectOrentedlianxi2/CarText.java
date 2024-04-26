package com.an.ObjectOrentedlianxi2;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/1 15:18
 */
public class CarText {
    public static void main(String[] args) {
        //1.定义一个数组
        Car[] array = new Car[3];




        //2.通过键盘录入把数据
        Scanner sc  = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            Car c = new Car();
            //键盘输入品牌
            System.out.println("输入汽车的品牌");
            String brand  = sc.next();
            c.setBrand(brand);
            //键盘输入价格
            System.out.println("输入汽车的价格");
            double price = sc.nextDouble();
            c.setPrice(price);
            //键盘输入汽车的颜色
            System.out.println("输入汽车的颜色");
            String color = sc.next();
            c.setColor(color);

            //通过键盘录入把数据存入数组
            array[i] = c;
        }

        //3.遍历数组
        for (int i = 0; i < array.length; i++) {
            Car Car =  array[i];
            System.out.println(Car.getBrand() + ", " +Car.getPrice() + ", "+Car.getColor());
        }
    }
}
