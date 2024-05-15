package com.TCP.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/15 21:26
 */
public class jieshou {
    public static void main(String[] args) throws IOException {
        //TCP协议，接收数据


        //1.创健ServerSocket对象
        ServerSocket ss = new ServerSocket(2000);

        //2.监听客户端的链接
        Socket socket = ss.accept();

        //3.从链接通道中获取输入流读取数据信息
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(isr);
        String b;
        while ((b=bf.readLine())!=null){
            System.out.println(b);
        }

        //4.释放资源
        socket.close();
        ss.close();
    }
}
