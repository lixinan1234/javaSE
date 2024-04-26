package com.xinan.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/9 9:56
 */
public class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("按钮被点击了");
    }
}
