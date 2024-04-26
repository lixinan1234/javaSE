package com.File;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/19 14:24
 */
public class Demo5 {
    public static void main(String[] args) {
        //1.listRoots 获取系统中所有的盘符
//        File[] files = File.listRoots();
//        System.out.println(Arrays.toString(files));

        //2.list 获取当前该路径下所有内容
//        File f1 = new File("C:\\Users\\李新安\\Desktop\\Java代码\\vvv");
//        String[] list = f1.list();
//        for (String s : list) {
//            System.out.println(s);
//        }



        //需求：打印里面的所有txt文件
//        File f2 = new File("C:\\Users\\李新安\\Desktop\\Java代码\\vvv");
//        File[] files = f2.listFiles();
//        for (File file : files) {
//            if(file.isFile()&&file.getName().endsWith(".txt")){
//                System.out.println(file);
//            }
//        }

        //3.listFiles 利用文件名过滤器获取当前该路径下所有的文件
        File f3 = new File("C:\\Users\\李新安\\Desktop\\Java代码\\vvv");
        File[] arr1 = f3.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr1));
    }
}
