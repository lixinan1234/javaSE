package com.an.StringAlgorithmicProblem;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/6 15:25
 */
public class StringAlgorithmicProblem1 {
    public static void main(String[] args) {
        //题目：键盘录入一个字符串，
        //要求1：长度为小于等于9
        //要求2：只能是数字，将内容变成罗马数字
        //阿拉伯数字跟罗马数字的比较关系：
        //Ⅰ是1，Ⅱ是2，Ⅲ是3，Ⅳ是4，Ⅴ是5，Ⅵ是6，Ⅶ是7，Ⅷ是8，Ⅸ是9，Ⅹ是10。


        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("键盘录入一个小于或等于9的字符串：");
            str = sc.next();

            //2.校验字符串是否满足规则
            boolean flag = checkStr(str);
            if (flag == true) {
                break;
            } else {
                System.out.println("当前字符串不正确，请重新输入");
            }
        }


        //将内容变成罗马数字
        //阿拉伯数字跟罗马数字的比较关系：
        //Ⅰ是1，Ⅱ是2，Ⅲ是3，Ⅳ是4，Ⅴ是5，Ⅵ是6，Ⅶ是7，Ⅷ是8，Ⅸ是9
        //查表法：数字跟数据产生一个对应关系
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48;
            String s = changeLuoMa(number);
            sb.append(s);

        }
        System.out.println(sb);

    }

    public static boolean checkStr(String str) {
        //要求1：长度为小于等于9
        if (str.length() > 9) {
            return false;
        }

        //要求2：只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static String changeLuoMa(int number) {
        //定义一个数组，让索引跟罗马数字产生一个对应的关系
        String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return arr[number];
    }

}
