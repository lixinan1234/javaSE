package com.UTF;

        import java.util.Arrays;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/21 15:44
 */
public class Demo1 {
    public static void main(String[] args) {
        //1.编码
        String str = "ai你哟";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        //2.解码
        String str2 = new String(bytes);
        System.out.println(str2);
    }
}
