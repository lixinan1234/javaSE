package com.Regex;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/2/17 13:35
 */
public class Regex1 {
    public static void main(String[] args) {

        /*
         假如写在要求校验一个qq号码是否正确。
         规则：6位及20位之内，0不能开头，必须全部都是数字。
         先使用目前所学知识完成校验需求。
         然后体验正则表达式。
         */

        String qq = "123456789";
        System.out.println(checkQQ(qq));


    }

    public static boolean checkQQ(String qq){
        //规则：6位及20位之内，0不能开头，必须全部都是数字。

        //6位及20位之内
        int len = qq.length();
        if(len<6 && len>20){
            System.out.println("请输入6位及20位之内的数字");
            return false;
        }
        //0不能开头
        if (qq.startsWith("0")){
            System.out.println("0不能开头");
            return false;
        }
        //必须全部都是数字。
        for (int i = 0; i < qq.length(); i++) {
            int length = qq.charAt(i);
            if(length < '0' || length >'9'){
                System.out.println("必须全部都是数字。");
                return false;
            }
        }
        System.out.println("账号正确");
        return true;
    }
}
