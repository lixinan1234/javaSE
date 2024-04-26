package com.xinan.demo2;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/14 22:38
 */
public class Switch {
    public static void main(String[] args) {
        //兰州拉面，武汉热干面，北京炸酱面，陕西油泼面

        //1.定义变量记录我心中想吃的面

        String noodles = "兰州拉面";

        //2.拿着这个面利用switch跟四种面条进行匹配
        switch (noodles) {
            case "兰州拉面":
                System.out.println("兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("陕西油泼面");
                break;
            default:
                System.out.println("滚！吃屎去吧！！");
        }

    }
}
