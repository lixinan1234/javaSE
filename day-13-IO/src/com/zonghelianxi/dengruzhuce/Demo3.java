package com.zonghelianxi.dengruzhuce;

import java.io.*;
import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/6 20:39
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        /*
        需求：写一个登陆小案例（添加锁定账号功能）

        步骤：
        	将正确的用户名和密码手动保存在bb.txt文件中。
        	保存格式为:username=zhangsan&password=123&count=0
        	让用户键盘录入用户名和密码
        	比较用户录入的和正确的用户名密码是否一致
        	如果一致则打印登陆成功
        	如果不一致则打印登陆失败，连续输错三次被锁定

        */

        //1.读取正确的用户名和密码
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\李新安\\Desktop\\Java代码\\bb.txt"));
        String line = br.readLine();//username=zhangsan&password=123&count=0
        br.close();

        String[] userInfo = line.split("&");
        String[] arr1 = userInfo[0].split("=");
        String[] arr2 = userInfo[1].split("=");
        String[] arr3 = userInfo[2].split("=");

        String username = arr1[1];
        String password = arr2[1];
        //count:表示用户连续输错的次数
        int count = Integer.parseInt(arr3[1]);

        //2.用户键盘录入用户名和密码
        Scanner s = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = s.nextLine();
        System.out.println("请输入密码");
        String word = s.nextLine();

        //3.比较
            if (username.equals(name)&&password.equals(word)&&count<3){
                System.out.println("登入成功！！！");
                writeInfo("username="+username+"&password="+password+"&count=0");
            }else {
                count++;
                if(count<3){
                    System.out.println("用户名或者密码输入错误,还剩下"+(3-count)+"次机会");
                }else {
                    System.out.println("用户被锁定！！");
                }

                writeInfo("username=" + username + "&password=" + password + "&count=" + count);
            }
        }

    /*
     * 作用：
     *       写出一个字符串到本地文件中
     * 参数：
     *       要写出的字符串
     * */
    public static void writeInfo(String content) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\李新安\\Desktop\\Java代码\\bb.txt"));
        bw.write(content);
        bw.close();
    }
}
