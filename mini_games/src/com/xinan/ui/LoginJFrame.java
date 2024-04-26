package com.xinan.ui;

import javax.swing.*;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/7 21:38
 */
public class LoginJFrame extends JFrame {
    //LoginJFrame 表示登入界面
    //以后所有跟登入相关的代码，都写在这里

    public LoginJFrame(){
        //在创建登入界面的时候，同时给这个界面去设置一些信息
        //比如宽高，直接展示出来
        this.setSize(488,430);
        //设置界面的标题
        this.setTitle("拼图 登入入口");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);


        //设置是否显示，建议写在最后
        this.setVisible(true);
    }


}
