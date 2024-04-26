package com.lianxiti;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/19 15:49
 */
public class Test1 {
    public static void main(String[] args) {

        /*
             键盘录入一些1~100之间的整数，并添加到集合当中
             直到集合中所有数据和超过200为止
         */

        //1.创建一个集合用来添加整数
        ArrayList<Integer> list = new ArrayList<>();
        //2.键盘录入数据添加到集合中
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数");
            String str1 = sc.nextLine();
            int num = Integer.parseInt(str1);
            //先把异常数据进制过滤
            if (num < 1 || num > 100) {
                System.out.println("请输入1~100之间的整数");
                continue;
            }
            //添加到集合
            list.add(num);

            //统计集合中所有的数据和
            int sum = getSum(list);
            //对sum进行判断
            if (sum > 200) {
                System.out.println("集合中所有的数据和已经满足要求");
                break;
            }
        }

        //验证结论
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }


    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int integer = list.get(i);
            sum = sum + integer;
        }
        return sum;
    }
}
