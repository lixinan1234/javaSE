package com.an.String;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/3 16:52
 */
public class StringDemo4 {
    public static void main(String[] args) {
        //练习：已知正确的用户名和密码，请用程序现实模拟用户登入
        //      总共给三次机会，登入之后，给出相应提示
        //1.定义一个账号和密码
        String id = "name";
        String password = "abc";


        for (int i = 0; i < 3; i++) {
            //键盘录入账号和密码
            Scanner sc = new Scanner(System.in);
            //输入用户账号
            System.out.println("请输入用户名");
            String id1 = sc.next();
            //输入用户密码
            System.out.println("请输入密码");
            String password1 = sc.next();

            //进行比较
            if (id.equalsIgnoreCase(id1) && password.equalsIgnoreCase(password1)) {
                System.out.println("登入成功！");
                break;
            } else {
                if(i == 2){
                    //最后一次机会也输入错误，此时要提示账号锁定
                    System.out.println("次数已用完，请联系管理员小姐姐：15979346712");
                }else {
                    System.out.println("登入失败,用户名或者密码错误,您还剩下"+(2 - i)+"次机会");
                }

            }
        }
    }
}
