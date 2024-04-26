package com.an.String;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/4 16:15
 */
public class StringDemo7 {
    public static void main(String[] args) {
        /*题目：定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
              调用该方法，并在控制台输出结果
          例如：数组为 int[] arr = {1,2,3}
                执行方法后的输出结果为：[1,2,3]
         */


        int[] arr = {1,2,3};
        String s = arrToString(arr);
        System.out.println(s);
    }




    //1.我要干嘛  --------- 遍历数组并把数组拼接成一个字符串
    //2.我干这件事需要什么才能返回 -----数组
    //3.我干完了是否把结果返回调用出  ----- 返回一个拼接之后的字符串
    public static  String arrToString(int[] arr){
        if(arr == null){
            return "";
        }
        if(arr.length == 0){
            return "[]";
        }

        String result = "[";
        //代码执行到这里表示什么？
        //表示数组不是null，也不是长度为0的
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                result = result + arr[i];
            }else {
                result = result + arr[i] +", ";
            }
        }
        result = result +"]";
        //[1,2,3]
        return result;
    }
}
