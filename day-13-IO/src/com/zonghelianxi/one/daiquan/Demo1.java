package com.zonghelianxi.one.daiquan;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/30 11:45
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //1.把文件中所有的学生信息读取到内存中
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\李新安\\Desktop\\Java代码\\c.txt"));
        String len;
        while ((len = br.readLine()) != null) {
            String[] arr = len.split("-");
            Student stu = new Student(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));
            list.add(stu);
        }
        br.close();

        //2.计算权重的总和
        double weight = 0;
        for (Student student : list) {
            weight = weight + student.getWeight();
        }
        System.out.println("计算权重的总和"+weight);

        //3.计算每一个人的实际占比
        double[] arr = new double[list.size()];
        int index = 0;
        for (Student student : list) {
            arr[index]= student.getWeight() / weight;
            index++;
        }
        System.out.println("计算每一个人的实际占比"+ Arrays.toString(arr));

        //4.计算每一个人的权重占比范围
        for (int i = 1; i < arr.length; i++) {
            arr[i]  = arr[i] + arr[i - 1];
        }

        //5.随机抽取
        //获取0.0~1.0之间的随机数
        double number = Math.random();
        //判断number在arr中的位置
        int index1 = -Arrays.binarySearch(arr, number)-1;
        Student student = list.get(index1);
        System.out.println(student);

        //6.修改当前学生的权重
        double v = student.getWeight() / 2;
        student.setWeight(v);
        System.out.println(list);

        //7.把集合中的数据再次写到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\李新安\\Desktop\\Java代码\\c.txt"));
        for (Student stu : list) {
            bw.write(stu.toString());
            bw.newLine();
        }
        bw.close();
    }
}
