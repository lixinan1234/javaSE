package com.an.ObjectOrentedlianxi2;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/1 15:58
 */
public class PhoneText {
    public static void main(String[] args) {
        //定义一个数组
        Phone[] array = new Phone[3];

        //创建三部手机的对象
        Phone p1 = new Phone("华为Meat60", 6999.0, "白色");
        Phone p2 = new Phone("苹果", 10000.0, "黑色");
        Phone p3 = new Phone("小米", 5999, "红色");

        //把手机对象添加到数组中
        array[0] = p1;
        array[1] = p2;
        array[2] = p3;


        //获取三部手机的平均价格
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            Phone Phone = array[i];
            sum = sum + Phone.getPrice();

        }

        //求平均值
        double avg  = sum / array.length;
        System.out.println(avg);
    }

}
