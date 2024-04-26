package com.an.StringAlgorithmicProblem;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/7 15:21
 */
public class StringAlgorithmicProblem3 {
    public static void main(String[] args) {
        //一段英语："Hello World",输出为5,最后一个单词world,长度为5
        StringBuilder sb = new StringBuilder("Hello World");
        StringBuilder reverse = sb.reverse();
        String str = str(sb.toString());
        for (int i = 0; i < reverse.length(); i++) {
            reverse.charAt(i);
            if(str == " "){
                System.out.println(str);
            }
        }

    }

    public static String str(String reverse) {

        return reverse;
    }
}
