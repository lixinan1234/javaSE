package com.an.Practice;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/14 1:17
 */
public class DigitalEncryption {
    public static void main(String[] args) {
        /*
        * 需求：
        * #某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
        * #规则如下：
        * 先得到每位数
        * 然后每位数都加上5
        * 再对10求余
        * 最后将所有数字反转
        * 得到一串新数。
        * */
        //分析：
        //1.把整数里面的每一位放到数组中
        int[] array = {1,9,8,3};
        //2.加密
        for (int i = 0; i < array.length; i++) {
            //每位数都加上5
            array[i]= array[i] + 5;

            //再对10求余
            array[i] =  array[i] % 10;
            System.out.println(array[i]);
        }

          //最后将所有数字反转
        for (int i = 0, j = array.length - 1;i < j; i++ ,j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

        //3.把数组里面的每一位数字进行拼接，变成加密之后的结果
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            number = array[i] + number * 10;
        }
        System.out.println(number);
    }
}
