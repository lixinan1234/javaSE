package com.Runtime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/12 14:58
 */
public class MyJFrame extends JFrame implements ActionListener {

    JButton yesBut = new JButton("帅爆了");
    JButton midBut = new JButton("一般般吧");
    JButton roBut = new JButton("不帅，有点拉跨");
    JButton dadBut =new JButton("饶了我吧");

    //决定了上方的按钮是否展示
    //true:展示
    //false:不展示
    boolean flag = false;



    public MyJFrame(){

        initJFrame();

        initView();
    }

    private void initView() {



        this.getContentPane().removeAll();

        if(flag){
            //展示按钮

            dadBut.setBounds(50,20,100,30);
            dadBut.addActionListener(this);
            this.getContentPane().add(dadBut);
        }




        JLabel text  = new JLabel("你觉得自己帅吗");
        text.setFont(new Font("微软雅黑",0,30));
        text.setBounds(120,150,300,50);

        yesBut.setBounds(200,250,100,30);
        midBut.setBounds(200,320,100,30);
        roBut.setBounds(160,400,180,30);

        yesBut.addActionListener(this);
        midBut.addActionListener(this);
        roBut.addActionListener(this);


        this.getContentPane().add(text);
        this.getContentPane().add(yesBut);
        this.getContentPane().add(midBut);
        this.getContentPane().add(roBut);

        this.getContentPane().repaint();



    }

    //整体界面做设置
    private void initJFrame() {
        //设置界面的宽高
        this.setSize(500, 600);
        //设置界面的标题
        this.setTitle("恶搞基友");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);

        //取消默认的居中的设置，只有取消了才会安装XY轴的形式添加组件
        this.setLayout(null);

        //设置是否显示，建议写在最后
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj==yesBut){
            System.out.println("你的好基友点击了帅爆了");

            showJDialog("你太自信了，兄弟，必须给你一点小惩罚！！");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 1800");
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            flag = true;
            initView();

        }else if(obj==midBut){
            System.out.println("你的好基友点击了一般般把");

            showJDialog("你还是太自信了，兄弟，还是得给你一点小惩罚！！");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            flag = true;
            initView();

        }else if(obj==roBut){
            System.out.println("你的好基友点击了不帅");

            showJDialog("兄弟，你有自知之明，也要给你一点小惩罚！！");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 7200");
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            flag = true;
            initView();

        }else if(obj==dadBut){
            showJDialog("这次就饶了你");

            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }


    public void showJDialog(String content){
        //创建弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(400,300);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框中
        JLabel warning = new JLabel(content);
        warning.setBounds(0,0,200,300);
        jDialog.getContentPane().add(warning);

        //让弹框显示出来
        jDialog.setVisible(true);
    }
}
