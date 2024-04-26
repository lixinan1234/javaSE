package com.an.ObjectOrentedlianxi;

import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/10/29 16:33
 */
public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于去攻击别人
    //思考：谁攻击谁？
    //Role r1 = new Role();
    //Role r2 = new Role();
    //r1.攻击（r2）;
    //方法调用者去攻击参数
    public void attack(Role role) {
        //计算造成的伤害 1~20
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        //剩余血量
         int remainBlood = role.getBlood()-hurt;
         //对剩余血量做一个验证，如果为负数就修改为0
         remainBlood =  remainBlood < 0 ? 0:remainBlood;
        //修改下挨揍人的血量
        role.setBlood(remainBlood);
        //this表示方法的调用者


        System.out.println(this.getName() + "举起拳头，打了" + role.getName() +
                "一下，造成了"+hurt+"点伤害，"+role.getName()+"还剩余"+remainBlood+"点血");
    }
}
