package com.xinan.ui;

import javax.swing.*;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/7 21:40
 */
public class RegisterJFrame extends JFrame {

    public RegisterJFrame(){
        this.setSize(488,500);
        //设置界面的标题
        this.setTitle("拼图 注册入口");
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
