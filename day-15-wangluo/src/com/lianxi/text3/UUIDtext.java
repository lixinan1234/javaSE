package com.lianxi.text3;

import java.util.UUID;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/5/16 21:55
 */
public class UUIDtext {
    public static void main(String[] args) {
        String str = UUID.randomUUID().toString().replace("-", "");
        System.out.println(str);
    }
}
