package com.threesxfs.three;

import java.util.concurrent.Callable;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/9 16:21
 */
public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        //求1~100的合
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;

        }

        return sum;
    }
}
