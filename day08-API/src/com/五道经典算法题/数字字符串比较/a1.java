package com.五道经典算法题.数字字符串比较;

import java.util.Arrays;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/26 15:27
 */
public class a1 {
    public static void main(String[] args) {
        //定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
        //要求1：属性有姓名，年龄，身高
        //要求2；按照年龄的大小进行排序，年龄一样，按照身高排序，升高一样就按照姓名的字母进行排序

        //1.创建3个女朋友的对线
        GirlFriend s1 = new GirlFriend("xuanxuan",22,1.67);
        GirlFriend s2 = new GirlFriend("anan",20,1.77);
        GirlFriend s3 = new GirlFriend("lele",21,1.87);

        //2.定义一个数组存储女朋友的信息
        GirlFriend[] arr = {s1,s2,s3};

        //3.利用Array的sort方法进行排序
        Arrays.sort(arr,(o1,o2)-> {
                //按照年龄的大小进行排序，年龄一样，按照身高排序，升高一样就按照姓名的字母进行排序
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                //compareTo使用阿斯抠码表比较字符串
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                return (int)temp;
            }
        );
        System.out.println(Arrays.toString(arr));

        }
    }


