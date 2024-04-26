package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/9 17:13
 */
public class RegexPaCho3 {
    public static void main(String[] args) {

        //贪婪爬取和非贪婪爬取
        String s = "abbbbbbbbaaaaaa傻呗"+
                "Java 自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，"
                +"因为这两个是长期支持版本，下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";

        String regex = "ab+?";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);
        while (m1.find()){
            String g1 = m1.group();
            System.out.println(g1);
        }
    }
}
