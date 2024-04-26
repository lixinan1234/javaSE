package com.lianxiti;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/3/19 16:15
 */
public class Test2 {
    public static void main(String[] args) {

        /*

        自己实现parseInt方法的效果，将字符串形式的数据转成整数
        要求：
            字符串中只能是数字不能有其他字符
            最少一位，最多10位
            0不能开头

         */

       //1.定义一个字符串
        String str = "124455";
        //2.校验字符串
        if(!str.matches("[0-9]\\d{0,9}")){
            //错误数据
            System.out.println("数据格式有误");
        }else{
           //正确数据
            System.out.println("数据格式正确");

            //3.定义一个变量表示最终的结果
            int number = 0;

            //4.遍历字符串得到里面每一个字符
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                number = number * 10 + c;

            }

            System.out.println(number);



        }

    }
}
