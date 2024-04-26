package com.huancholiulianxi2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/24 10:12
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*

             要求：把此文件的字按顺序进行恢复到一个新文件中。

         */

        //1.读取文件
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\李新安\\Desktop\\Java代码\\csb1.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while ((line = br.readLine())!=null){
            list.add(line);
        }
        br.close();

        //2.排序

        //排序规则：按照每一行前面的序号进行排列
        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                //获取o1和o2的序号
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);

                return i1-i2;
            }
        });
        System.out.println(list);


        //3.写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\李新安\\Desktop\\Java代码\\csb2.txt"));
        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();

    }
}
