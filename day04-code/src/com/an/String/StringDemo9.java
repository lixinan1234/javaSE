package com.an.String;

import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/4 18:51
 */
public class StringDemo9 {
    public static void main(String[] args) {
        //1.键盘录入一个金额
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个金额");
            money = sc.nextInt();
            if (money >= 0 && money < 10000000) {
                break;
            } else {
                System.out.println("请输入正确的金额");
            }
        }


        //定义一个变量用来表示钱的大写
        String moneyStr = "";

        //2.得到money里面的每一位数字，再转成中文
        while (true) {
            //从右往左获取数据，因为右边是数据的各位
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            //把转换之后的大写拼接到moneyStr当中
            moneyStr = capitalNumber + moneyStr;
            //去掉刚刚获取的数据
            money = money / 10;

            //如果数字上的每一位全部获取到了，那么money记录的就是0，此时循环结束
            if (money == 0) {
                break;
            }
        }


        //3.在前面补0，补齐7位
        int count = 7 - moneyStr.length();//假如是2135 4位 就要补3个0
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        //4.插入单位
        //定义一个数组表示单位
        String money1 = "";
        String[] arr = {"佰","拾","万","仟","百","拾","元"};
        for (int i = 0; i < moneyStr.length(); i++) {
            //i 依次表示字符串中的每一个索引
            char c = moneyStr.charAt(i);
            //字符串拼接
             money1 = money1 + c + arr[i];
        }

        System.out.println(money1);
    }


    //定义一个方法把数字变成大写的中文
    //1 -- 壹
    public static String getCapitalNumber(int number) {
        //定义一个数组，让数字跟大写的中文产生对应的关系
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        //返回结果
        return arr[number];
    }
}
