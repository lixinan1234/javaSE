package com.zonghelianxi.dengruzhuce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/2 19:08
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
             需求：写一个登陆小案例。

            步骤：
                 将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
                 保存格式为:username=zhangsan&password=123
                 让用户键盘录入用户名和密码
                 比较用户录入的和正确的用户名密码是否一致
                 如果一致则打印登陆成功
                 如果不一致则打印登陆失败
        */

        //1.读取正确的用户名和密码
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\李新安\\Desktop\\Java代码\\aa.txt"));
        String line = br.readLine();//username=zhangsan&password=123
        br.close();

        String[] userInfo = line.split("&");
        String[] arr1 = userInfo[0].split("=");
        String[] arr2 = userInfo[1].split("=");

        String username = arr1[1];
        String password = arr2[1];

        //2.用户键盘录入用户名和密码
        Scanner s = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = s.nextLine();
        System.out.println("请输入密码");
        String word = s.nextLine();

        //3.比较
        if (!username.equals(name)){
            System.out.println("用户名输入错误");
        }else if (!password.equals(word)){
            System.out.println("密码输入错误");
        }else {
            System.out.println("登入成功！！！");
        }


    }
}
