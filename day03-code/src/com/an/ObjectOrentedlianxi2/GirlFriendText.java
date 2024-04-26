package com.an.ObjectOrentedlianxi2;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/1 16:27
 */
public class GirlFriendText {
    public static void main(String[] args) {
        //1.创建一个数组
        GirlFriend[] array = new GirlFriend[4];

        //2.创建四个女朋友的对象
        GirlFriend r1 = new GirlFriend("小艾", 18, '女', "吃");
        GirlFriend r2 = new GirlFriend("小颖", 20, '女', "喝");
        GirlFriend r3 = new GirlFriend("小萱", 22, '女', "拉");
        GirlFriend r4 = new GirlFriend("小丽", 16, '女', "撒");

        //把女朋友添加到数组当中
        array[0] = r1;
        array[1] = r2;
        array[2] = r3;
        array[3] = r4;

        //计算四个女朋友的平均年龄
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            GirlFriend GirlFriend = array[i];//拿到每个女朋友的对象
            sum = sum + GirlFriend.getAge();//把年龄拿出来进行累加
        }
        int avg = sum / array.length;
        System.out.println(avg);


        int count = 0;
        for (int i = 0; i < array.length; i++) {
            GirlFriend GirlFriend = array[i];//拿到每个女朋友的对象
            if (GirlFriend.getAge() < avg) {
                count++;
                System.out.println(GirlFriend.getName() + "  " + GirlFriend.getSex() + "  " + GirlFriend.getAge() + "  " + GirlFriend.getHobby());
            }
        }
        System.out.println(count + "个");
    }
}
