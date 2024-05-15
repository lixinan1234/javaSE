package com.lianxi.text1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/15 22:21
 */
public class jieshou {
    public static void main(String[] args) throws IOException {
        //1.创建ServerSocket对象
        ServerSocket ss = new ServerSocket(1000);

        //2.监听客户端
        Socket socket = ss.accept();

        //3.获取输入流读数据，并把数据显示控制台
        InputStreamReader bf = new InputStreamReader((socket.getInputStream()));
        int b;
        while ((b = bf.read()) != -1){
            System.out.print((char) b);
        }

        //4.释放资源
        socket.close();
        ss.close();
    }
}
