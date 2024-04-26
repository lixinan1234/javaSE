package com.xinan.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/9 11:10
 */
public class MyFrame2 extends JFrame implements KeyListener {

    public MyFrame2() {
        //在创建登入界面的时候，同时给这个界面去设置一些信息
        //比如宽高，直接展示出来
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认的居中的设置，只有取消了才会安装XY轴的形式添加组件
        this.setLayout(null);

       //给整个窗体添加键盘监听
        this.addKeyListener(this);

        //设置是否显示，建议写在最后
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
        //获取键盘上每一个按键的编号
        int code = e.getKeyCode();
//        int code1 = e.getKeyChar();
//        System.out.println(code1);
        if(code == 65){
            System.out.println("现在按的是A");
        }else if(code == 66){
            System.out.println("现在按的是B");
        }
    }
}
