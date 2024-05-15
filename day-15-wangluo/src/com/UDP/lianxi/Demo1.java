package com.UDP.lianxi;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/15 12:44
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
         /*
            按照下面的要求实现程序
                UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
                UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
        */

         //1.创建对象
        DatagramSocket ds = new DatagramSocket();

        //2.打包数据
        Scanner sc  = new Scanner(System.in);
        while (true){
            System.out.println("请输入发送数据：");
            String i = sc.nextLine();
            if(i.equals("886")){
                break;
            }else {
                byte[] bytes = i.getBytes();
                InetAddress byName = InetAddress.getByName("127.0.0.1");
                int port = 10086;
                DatagramPacket dp = new DatagramPacket(bytes,bytes.length,byName,port);
                //3.发送数据
                ds.send(dp);
            }
        }

        //4.释放资源
        ds.close();
    }
}
