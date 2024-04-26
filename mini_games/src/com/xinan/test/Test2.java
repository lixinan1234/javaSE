package com.xinan.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/9 9:42
 */
public class Test2 {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        //比如宽高，直接展示出来
        jFrame.setSize(488,430);
        //设置界面的标题
        jFrame.setTitle("事件演示");
        //设置界面置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(3);
        //取消默认的居中的设置，只有取消了才会安装XY轴的形式添加组件
        jFrame.setLayout(null);



        //创建一个按钮对象
        JButton jtb = new JButton("点我啊");
        //设置位置和宽高
        jtb.setBounds(0,0,100,50);
        //给按钮添加动作监听
        //jtb:组件对象，表示你要给那个组件添加事件
        //addActionListener：表示我要给组件添加那个事件的监听（动作监听鼠标左键，空格）
        //jtb.addActionListener(new MyActionListener());
        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("哒咩~不要点我哟~");
            }
        });


        //把按钮添加到界面中
        jFrame.getContentPane().add(jtb);





        //设置是否显示，建议写在最后
        jFrame.setVisible(true);
    }
}
