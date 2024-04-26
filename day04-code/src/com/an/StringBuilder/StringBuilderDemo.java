package com.an.StringBuilder;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/5 12:28
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {1,2,3};

        //2.调用方法把数组变成字符串
        String s = arrToString(arr);
        System.out.println(s);
    }
    public static String arrToString(int[] arr){
        //定义一个StringBuilder的对象
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
