package com.Exception;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/18 20:26
 */
public class NameFormatException extends RuntimeException{
    //技巧：
    //NameFormat：当前异常的名字，表示姓名格式化问题
    //Exception：表示当前类是一个异常类

    //运行时：RuntimeException 核心 表示由于参数错误导致的问题
    //编译时：Exception 核心 提醒程序员检查本地信息

    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
