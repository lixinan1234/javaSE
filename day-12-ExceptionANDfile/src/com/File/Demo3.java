package com.File;

import java.io.File;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/18 21:54
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        //1.createNewFile  创建一个新的空的文件
//        File f1 = new File("C:\\Users\\李新安\\Desktop\\Java代码\\bbb");
//        boolean newFile = f1.createNewFile();
//        System.out.println(newFile);


        //2.mkdir 创建文件夹
        File f1 = new File("C:\\Users\\李新安\\Desktop\\Java代码\\vvv\\ddd\\v\\e");
//        boolean mkdir = f1.mkdir();
//        System.out.println(mkdir);

        //3.mkdir 创建多级文件夹
        boolean mkdirs = f1.mkdirs();
       System.out.println(mkdirs);

        //4.delete 删除文件夹
//        boolean delete = f1.delete();
//        System.out.println(delete);

    }
}
