package com.Exception;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/18 19:34
 */
public class Demolianxi {
    public static void main(String[] args) {
        /*
        需求：
              键盘录入自己心怡女朋友的姓名和年龄。
              姓名长度在3~10之间，
              年龄的范围18~40岁之间，
              超出这个范围是异常数据不能赋值，需要重新录入，一直到正确为止。

        提示：
              需要考虑用户在键盘录入时的所有情况。
              比如：录入年龄超出范围，录入年龄时录入了abc等情况

         */

        //1.创建键盘录入的对象
        Scanner sc = new Scanner(System.in);
        //2.创建女朋友的对象
        GirlFriend gf = new GirlFriend();
        while (true) {
            try {
                //3.接收女朋友的姓名
                System.out.println("输入姓名");
                String name = sc.nextLine();
                gf.setName(name);
                //3.接收女朋友的年龄
                System.out.println("输入年龄");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);
                //如果所有数据都是正确的，那么跳出
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (NameFormatException e) {
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
            }

        }
        //打印
        System.out.println(gf);

    }
}
