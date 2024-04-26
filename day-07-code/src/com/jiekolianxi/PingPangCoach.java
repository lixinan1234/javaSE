package com.jiekolianxi;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/6 20:46
 */
public class PingPangCoach extends Coach implements Speak{

    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练在教如何打篮球");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("乒乓球教练在说英语");
    }
}
