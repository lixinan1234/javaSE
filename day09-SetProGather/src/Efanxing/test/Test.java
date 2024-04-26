package Efanxing.test;

import java.util.ArrayList;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/2 16:46
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<persianCat> list1 = new ArrayList<>();
        ArrayList<HuskyDog> list2 = new ArrayList<>();
        ArrayList<LiHuaCat> list3 = new ArrayList<>();
        ArrayList<TeddyDog> list4 = new ArrayList<>();

        keepPet(list1);
        keepPet(list3);
    }
    
    //1.该方法能养所有品种的猫，但不能养狗
    public static void keepPet(ArrayList<? extends Cat> list){
        //遍历集合，调用动物eat方法
    }
}
