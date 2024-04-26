package com.an.ObjectOrentedlianxi2;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/1 14:41
 */
public class GoodstText {
    public static void main(String[] args) {
        //1.创建一个数组
        Goods[] array =  new Goods[3];

        //2.创建三个商品对象
        Goods r1 = new Goods("001","华为Meat60",6999.0,10);
        Goods r2 = new Goods("003","金条",4000.0,5);
        Goods r3 = new Goods("004","苹果15",5999.0,10);

        //3.把商品添加到数组中
        array[0] = r1;
        array[1] = r2;
        array[2] = r3;

        //4.遍历数组
        for (int i = 0; i < array.length; i++) {
            Goods Goods = array[i];
            System.out.println(Goods.getId() + ", " +Goods.getName() + ", "+Goods.getPrice()+", "+Goods.getCount());
        }
    }
}
