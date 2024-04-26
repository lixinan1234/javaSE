package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/9 15:11
 */
public class RegexPaCho1 {
    public static void main(String[] args) {
        //要求：找出里面所有出现JavaXX
        String str = "Java 自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，"
                +"因为这两个是长期支持版本，下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";

        //Pattern:表示正则表达式
        //Matcher:文本匹配器，作用按照正则表达式的规则去读取字符串，从头开始读取。

        //1.获取正则表达式
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //2.获取文本匹配器的对象
        //拿着文本匹配器从头开始读取，寻找是否满足规则的字串。
        Matcher m = p.matcher(str);
        //3.利用循环获取
        while (m.find()){
            String g = m.group();
            System.out.println(g);
        }


        System.out.println("------------------");


        //需求：把下面文本中的座机电话，手机号，邮箱号码爬取出来。
        String str1 = "请练习我"+"电话：15979346712"+
                "座机电话：020-0324242"+
                "邮箱：2489460735@qq.com";
        String regex = "(1[3-9]\\d{9})|(0\\d{2,3}-?[1-9]\\d{4,9})|(\\w+@[0-9a-zA-Z]{2,6}(\\.[a-zA-Z]{2,3}){1,2})";

        //1.获取正则表达式
        Pattern p1 = Pattern.compile(regex);
        //2.获取文本的匹配对象
        Matcher m1 = p1.matcher(str1);
        //3.利用循环获取
        while (m1.find()){
            String g1 = m1.group();
            System.out.println(g1);
        }


    }
}
