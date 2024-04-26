package com.xin.ArrayList;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/13 17:16
 */
public class Phone {
    private String name;
    private int jiaGe;

    public Phone() {
    }

    public Phone(String name, int jiaGe) {
        this.name = name;
        this.jiaGe = jiaGe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJiaGe() {
        return jiaGe;
    }

    public void setJiaGe(int jiaGe) {
        this.jiaGe = jiaGe;
    }
}
