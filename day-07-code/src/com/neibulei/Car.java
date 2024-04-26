package com.neibulei;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/7 10:16
 */
public class Car {
    private String carName;
    int carColor;
    String carAge;

    public void show(){
        System.out.println();
    }


    class Engine{
        String EngineName;
        int EngineAge;

        public void show(){
            System.out.println(EngineName);
            System.out.println(carName);
        }
    }
}
