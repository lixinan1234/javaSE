package com.Commons;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/28 23:12
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
             /*
          FileUtils类
                static void copyFile(File srcFile, File destFile)                   复制文件
                static void copyDirectory(File srcDir, File destDir)                复制文件夹
                static void copyDirectoryToDirectory(File srcDir, File destDir)     复制文件夹
                static void deleteDirectory(File directory)                         删除文件夹
                static void cleanDirectory(File directory)                          清空文件夹
                static String readFileToString(File file, Charset encoding)         读取文件中的数据变成成字符串
                static void write(File file, CharSequence data, String encoding)    写出数据

            IOUtils类
                public static int copy(InputStream input, OutputStream output)      复制文件
                public static int copyLarge(Reader input, Writer output)            复制大文件
                public static String readLines(Reader input)                        读取数据
                public static void write(String data, OutputStream output)          写出数据
         */

             //复制文件
//        File src = new File("C:\\Users\\李新安\\Desktop\\Java代码\\a.txt");
//        File dest = new File("C:\\Users\\李新安\\Desktop\\Java代码\\xdy\\a.txt");
//        FileUtils.copyFile(src, dest);

        //复制文件夹
//        File src = new File("C:\\Users\\李新安\\Desktop\\Java代码\\10");
//        File dest = new File("C:\\Users\\李新安\\Desktop\\Java代码\\xdy");
//        FileUtils.copyDirectory(src,dest);

        //清空文件夹
//        File file = new File("C:\\Users\\李新安\\Desktop\\Java代码\\xdy");
//        FileUtils.cleanDirectory(file);

        //读取文件中的数据变成成字符串
//        File src = new File("C:\\Users\\李新安\\Desktop\\Java代码\\a.txt");
//        String s = FileUtils.readFileToString(src, "UTF-8");
//        System.out.println(s);

        //写入数据：调用FileUtils中write方法：参数（文件，需要写入的内容，字符集，是否追加至文件末尾）
        File file = new File("C:\\Users\\李新安\\Desktop\\Java代码\\c.txt");
        FileUtils.write(file,"李新安","UTF-8",true);




    }
}
