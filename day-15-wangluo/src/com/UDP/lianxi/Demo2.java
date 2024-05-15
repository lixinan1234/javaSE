package com.UDP.lianxi;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/15 12:45
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {

        //1.创建DatagramSocket对象（快递公司）
        //细节：
        //在接收的时候，一定要绑定端口
        //而且绑定的端口一定要跟发送的端口保持一致
        DatagramSocket ds = new DatagramSocket(10086);


        //2.接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);



        while (true) {
            ds.receive(dp);//接收
            //3.解析数据包
            byte[] data = dp.getData();
            int len = dp.getLength();
            String name = dp.getAddress().getHostName();
            String ip = dp.getAddress().getHostAddress();

            System.out.println("ip为：" + ip + ",主机名为：" + name + "的人，发送了数据：" + new String(data,0,len));
        }

    }
}
