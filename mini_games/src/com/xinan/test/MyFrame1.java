package com.xinan.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/9 10:52
 */
public class MyFrame1 extends JFrame implements MouseListener {

    //创建一个按钮对象
    JButton jtb1 = new JButton("点我啊");


    public MyFrame1() {
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

        //设置位置和宽高
        jtb1.setBounds(0, 0, 100, 50);

        //给按钮绑定鼠标事件
        jtb1.addMouseListener(this);

        //按钮添加到整个界面当中
        this.getContentPane().add(jtb1);

        //设置是否显示，建议写在最后
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
