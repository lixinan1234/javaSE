package com.Regex;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/11 18:55
 */
public class Regexfenzu1 {
    public static void main(String[] args) {

        //1.需求：判断一个字符串的开始字符和结束字符是否一致？只考虑一共字符
        //列举：a123a   b456b   12391   &abc&   a232b(false)
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("12391".matches(regex1));
        System.out.println("a232b".matches(regex1));
        System.out.println("----------------------------------");


        //2.需求：判断一个字符串的开始字符和结束字符是否一致？可以有多少个字符
        // acb12312abc   b456b   123kklj123   abc342334abd(false)
        String regex2 = "(.+).+\\1";
        System.out.println("abc12312abc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("123kklj123".matches(regex2));
        System.out.println("abc342334abd".matches(regex2));
        System.out.println("----------------------------------");


        //2.需求：判断一个字符串的开始字符和结束字符是否一致？开始部分内部每个字符也需要一致
        // aaa123aaa   bb234bb   111345111
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bb234bb".matches(regex3));
        System.out.println("111345111".matches(regex3));
        System.out.println("abc342334abd".matches(regex3));


    }
}
