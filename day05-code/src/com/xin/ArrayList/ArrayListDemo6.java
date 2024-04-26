package com.xin.ArrayList;

import java.util.ArrayList;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/13 15:23
 */
public class ArrayListDemo6 {
    public static void main(String[] args) {

        //1.创建一个集合
        ArrayList<id> list = new ArrayList<>();

        //2.创建对象
        id s1 = new id("1001","工藤新一","123456789");
        id s2 = new id("1002","服部平次","123456789");
        id s3 = new id("1003","赤井秀一","123456789");

        //3.添加到list集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //4.调用方法查看id是否存在
        boolean id = getId(list, "1001");
        System.out.println(id);
    }

    public static boolean getId(ArrayList<id> list,String id){
        for (int i = 0; i < list.size(); i++) {
            id id1 = list.get(i);
            String id2 = id1.getId();
            if(id2.equals(id)){
                //如果找到了直接返回true
                return true;
            }
        }
        //当循环结束表示集合里面所有的元素都已经比较完毕，还没一样的，那么就返回False
        return false;
    }
}
