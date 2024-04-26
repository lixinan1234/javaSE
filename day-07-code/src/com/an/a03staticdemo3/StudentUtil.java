package com.an.a03staticdemo3;

import java.util.ArrayList;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/21 16:15
 */
public class StudentUtil {
    public StudentUtil(){}


    public static int Max(ArrayList<Student> list){
        //1.定义一个参照物
        int max = list.get(0).getAge();

        //2.循环遍历集合

        for (int i = 0; i < list.size(); i++) {
            int  tempAge =  list.get(i).getAge();
            if(tempAge > max){
                max = tempAge;
            }
        }
        return max;
    }
}
