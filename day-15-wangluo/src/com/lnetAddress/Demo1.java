package com.lnetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/13 22:22
 */
public class Demo1 {
    public static void main(String[] args) throws UnknownHostException {
        /*
        static InetAddress getByName(String host)  确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        String getHostName()                        获取此IP地址的主机名
        String getHostAddress()                     返回文本显示中的IP地址字符串
*/


        //1.获取InetAddress的对象
        //IP的对象 一台电脑的对象
        InetAddress address = InetAddress.getByName("192.168.43.135");
        System.out.println(address);


        //获取此IP地址的主机名
        String name = address.getHostName();
        System.out.println(name);

        //返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();
        System.out.println(ip);

    }
}
