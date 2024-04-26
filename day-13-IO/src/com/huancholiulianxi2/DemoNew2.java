package com.huancholiulianxi2;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/24 10:45
 */
public class DemoNew2 {
    public static void main(String[] args) throws IOException {
        /*

             要求：把此文件的字按顺序进行恢复到一个新文件中。

         */

        //1.读取文件
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\李新安\\Desktop\\Java代码\\csb1.txt"));
        String line;
        TreeMap<Integer,String> tm = new TreeMap<>();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]),line);
        }
        br.close();

        //2.写出对象
        BufferedWriter bf =new BufferedWriter(new FileWriter("C:\\Users\\李新安\\Desktop\\Java代码\\csb2.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bf.write(value);
            bf.newLine();
        }

        //3.关流
        bf.close();
    }

}
