package com.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/21 21:47
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {


        FileWriter fw = new FileWriter("C:\\Users\\李新安\\Desktop\\Java代码\\xdy\\bbb.txt",true);

        fw.write("\r\n");
        fw.write("我好喜欢");
        fw.close();

    }
}
