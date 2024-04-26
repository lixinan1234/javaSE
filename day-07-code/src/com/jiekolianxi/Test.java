package com.jiekolianxi;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/6 20:51
 */
public class Test {
    public static void main(String[] args) {
        PingPangSporter ps = new PingPangSporter("马龙",20);
        System.out.println(ps.getName()+", "+ps.getAge());
        ps.SpeakEnglish();
        ps.study();
    }
}
