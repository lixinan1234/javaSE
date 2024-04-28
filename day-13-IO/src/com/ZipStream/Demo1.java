package com.ZipStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/26 17:03
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //1.创建一个File表示要解压的压缩包
        File src = new File("C:\\Users\\李新安\\Desktop\\Java代码\\xdy.zip");
        //2.创建一个File表示解压的目的地
        File dest = new File("C:\\Users\\李新安\\Desktop\\Java代码");

        //调用方法
        unzip(src, dest);
    }

    //定义一个方法用来解压
    public static void unzip(File src, File dest) throws IOException {
        //解压的本质：把压缩包里面的每个文件或者文件夹读取出来，按照层级拷贝到目的地当中

        //创建一个解压缩流用来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));

        //要先获取压缩包里面的每一个zipEntry对象
        //表示当前压缩包中获取的文件或者文件夹
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            if (entry.isDirectory()) {//.isDirectory判断是否是一个文件夹
                //文件夹：需要读取到压缩包中的文件，并把他存放到m目的地dest文件夹中（按照层级目录进行存放）
                File file = new File(dest, entry.toString());
                file.mkdirs();
            } else {
                //文件：需要在目的地dest处创建一个同样的文件夹出来
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zip.read())!=-1){
                    //写到目的地
                    fos.write(b);
                }
                //关流
                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();
    }

}
