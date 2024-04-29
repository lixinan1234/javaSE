package com.Hutool;

import cn.hutool.core.io.FileUtil;

import java.util.List;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/29 17:11
 */
public class Demo1 {
    public static void main(String[] args) {
         /*
        FileUtil类:
                file：根据参数创建一个file对象
                touch：根据参数创建文件

                writeLines：把集合中的数据写出到文件中，覆盖模式。
                appendLines：把集合中的数据写出到文件中，续写模式。
                readLines：指定字符编码，把文件中的数据，读到集合中。
                readUtf8Lines：按照UTF-8的形式，把文件中的数据，读到集合中

                copy：拷贝文件或者文件夹
    */

//         // file：根据参数创建一个file对象
//        File xdy = FileUtil.file("C:\\Users\\李新安\\Desktop\\Java代码", "xdy","aaa", "a.txt");
//        System.out.println(xdy);
//
//        //touch：根据参数创建文件
//        File touch = FileUtil.touch(xdy);
//        System.out.println(touch);
//
//        //writeLines：把集合中的数据写出到文件中，覆盖模式。
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"aaa","bbb","ccc");
//        File file = FileUtil.writeLines(list, "C:\\Users\\李新安\\Desktop\\Java代码\\b.txt", "UTF-8");
//        System.out.println(file);
//
//        //appendLines：把集合中的数据写出到文件中，续写模式。
//        ArrayList<String> list1 = new ArrayList<>();
//        Collections.addAll(list1,"aaa","bbb","ccc");
//        File file1 = FileUtil.appendLines(list1, "C:\\Users\\李新安\\Desktop\\Java代码\\b.txt", "UTF-8");
//        System.out.println(file1);

        // readLines：指定字符编码，把文件中的数据，读到集合中。
        List<String> strings = FileUtil.readLines("C:\\Users\\李新安\\Desktop\\Java代码\\a.txt", "UTF-8");
        System.out.println(strings);

    }
}
