package com.zonghelianxi.one;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/29 22:17
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
          /*需求：
            需求：
                有一个文件里面存储了班级同学的信息，每一个信息占一行。
                格式为：张三-男-23
                要求通过程序实现随机点名器。

            运行效果：
                第一次运行程序：随机同学姓名1（只显示名字）
                第二次运行程序：随机同学姓名2（只显示名字）
                第三次运行程序：随机同学姓名3（只显示名字）
                …
         */

          //1.读取文件中学生的姓名
        ArrayList list = new ArrayList();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\李新安\\Desktop\\Java代码\\c.txt"));
        String len;
        while ((len = br.readLine())!=null){
            list.add(len);
        }
        br.close();

        //2.随机抽取(解法一)
        Random r = new Random();
        int index = r.nextInt(list.size());
        String o = (String) list.get(index);
        String[] split = o.split("-");
        System.out.println(split[0]);

        //2.随机抽取(解法二)
        Collections.shuffle(list);
        String o1 = (String) list.get(0);
        String[] split1 = o1.split("-");
        System.out.println(split1[0]);


    }
}
