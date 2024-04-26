package com.an.StringAlgorithmicProblem;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/7 14:43
 */
public class StringAlgorithmicProblem2 {
    public static void main(String[] args) {
        //1.定义两个字符串
        String str1 = "abcde";
        String str2 = "cdeab";

        //2.旋转字符串

        boolean check = check(str1, str2);
        System.out.println(check);


//        boolean equals = rotate.equals(str2);
//        System.out.println(equals);


    }
    public static boolean check(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
          str1 = rotate(str1);
            if(str1.equals(str2)){
                return true;
            }
        }
        //所有的情况都比较完毕了，还不一样那么直接返回false
        return false;
    }



    //旋转字符串，把左侧的字符移动到右侧去
    public static String rotate(String str){
        String substring1 = str.substring(0, 1);
        String substring2 = str.substring(1);
        String s = substring2 + substring1;

        return s;
    }

}
