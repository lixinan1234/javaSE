package com.duotai.duotailianxi;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/3 15:08
 */
public class cat extends animal{
    public cat() {
    }

    public cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的猫眯着眼睛侧着吃"+something);
    }

    public void catchMouse(){
        System.out.println("猫在抓老鼠！");
    }
}
