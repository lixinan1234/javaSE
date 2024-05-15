package com.TCP.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/15 21:20
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //TCP协议，发送数据


        //1.创建Socket对象
        //细节：  在创建对象的同时会链接服务器
        //        如果连接不上，代码报错
        Socket socket = new Socket("127.0.0.1",2000);

        //2.可以从连接通道中获取输出流
        OutputStream os = socket.getOutputStream();
        //写出数据
        os.write("你好你好".getBytes());

        //3.释放数据
        os.close();
        socket.close();
    }
}
