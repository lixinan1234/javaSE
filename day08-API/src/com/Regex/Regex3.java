package com.Regex;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/2/18 12:50
 */
public class Regex3 {
    public static void main(String[] args) {
        //心得：
        //拿着一个正确的数据，从左到右依次去写。

        System.out.println("验证手机号是否正确：");
        String Regex1 = "15979346712";
        System.out.println(Regex1.matches("1[3-9]\\d{9}"));

        System.out.println("---------------------------------------");

        System.out.println("验证座机号码是否正确：");
        String Regex2 = "020-0324242";
        System.out.println(Regex2.matches("0\\d{2,3}-?[1-9]\\d{4,9}"));

        System.out.println("--------------------");

        System.out.println("邮箱号码是否正确：");
        String Regex3 = "\\w+@[0-9a-zA-Z]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("2489460735@qq.com".matches(Regex3));


        String Regex4 = "";
    }
}

