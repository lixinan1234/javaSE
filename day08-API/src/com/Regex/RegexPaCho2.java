package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/9 16:40
 */
public class RegexPaCho2 {
    public static void main(String[] args) {

        //需求1：爬取版本号为8，11，17的java文本，但是只要java,不显示版本号。
        //需求2：爬取版本号为8，11，17的java文本，正确爬取结果为：Java8 JAva11 Java17 Java17
        //需求3：爬取除了版本号8，11，17的java文本。


        String s = "Java 自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，"
                +"因为这两个是长期支持版本，下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";

        //需求1
        //1.获取正则表达式
        //?理解为前面的数据Java
        //=表示在Java后面要跟随的数据
        //但是在获取的时候，只获取前半部分
        Pattern p1 = Pattern.compile("Java(?=8|11|17)");
        //2.获取文本匹配器的对象
        Matcher m1 = p1.matcher(s);
        //3.利用循环获取
        while (m1.find()){
            String g1 = m1.group();
            System.out.println(g1);
        }
        System.out.println("--------------------------------");

        //需求2
        //1.获取正则表达式
        Pattern p2 = Pattern.compile("Java(8|11|17)");
        //2.获取文本匹配器的对象
        Matcher m2 = p2.matcher(s);
        //3.利用循环获取
        while (m2.find()){
            String g2 = m2.group();
            System.out.println(g2);
        }


    }
}
