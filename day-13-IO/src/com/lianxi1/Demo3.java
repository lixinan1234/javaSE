package com.lianxi1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/22 21:29
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        /*
              文本文件中有以下的数据：
                 2-1-9-4-7-8
              将文件中的数据进行排序，变成以下数据
                 1-2-4-7-8-9
         */

        //1.读取数据
        FileReader fr = new FileReader("C:\\Users\\李新安\\Desktop\\Java代码\\paixu.txt");
        StringBuilder sb = new StringBuilder();
        int len;
        while ((len = fr.read())!=-1){
            sb.append((char)len);
        }
        fr.close();
        System.out.println("原数据："+sb);
        //2.排序
        String str = sb.toString();
        String[] arrStr = str.split("-");//此时还是字符串

        ArrayList<Integer> list = new ArrayList<>();

        for (String s : arrStr) {
            int i = Integer.parseInt(s);
            list.add(i);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //3.写出
        FileWriter fw = new FileWriter("C:\\Users\\李新安\\Desktop\\Java代码\\paixu.txt");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                fw.write(list.get(i)+"");
            }else {
                fw.write(list.get(i)+"-");
            }
        }
        fw.close();
    }
}
