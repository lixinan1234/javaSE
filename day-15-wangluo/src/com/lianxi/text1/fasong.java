package com.lianxi.text1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/15 22:20
 */
public class fasong {
    public static void main(String[] args) throws IOException {
        //客户端：多次发送数据
        //服务器：接收多次接收数据，并打印

        //1.创建Socket对象
        Socket socket = new Socket("127.0.0.1", 1000);

        //2.获取输出流，写数据
        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入要发送的数据：");
            String line = sc.nextLine();
            if (line.equals("886")) {
                break;
            }
            //3.写出数据
            os.write(line.getBytes());
        }
            //4.释放资源
            socket.close();
    }
}

