package com.an.Practice;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/7/14 2:47
 */
public class DigitalDecryption {
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
         * 按照以上规则进行解密：
         * 比如1983加密之后变成8346，解密之后变成1983
        * */

        //1.定义数组记录解密之后的结果

        //2.反转
        int[] array = {8,3,4,6};
        for (int i = 0,j = array.length - 1; i < j; i++,j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        //3.由于加密是通过对10取余的方式进行获取的
        //所以在解密的时候就需要判断，0~4之间+10 5~9数字不变
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 0 && array[i]<=4){
                array[i] = array[i] +10;
            }
        }

        //4.每一位减5
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] - 5;
        }

        //5.获取数组里面每一位数字拼接成最终结果
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            number = array[i] + number * 10;
        }
        System.out.println(number);

    }
}
