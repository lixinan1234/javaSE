package com.xinan.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/7 21:35
 */
public class GameJFame extends JFrame implements KeyListener, ActionListener {

    //创建一个二维数组
    //目的：用来管理数据
    //加载图片的时候，会根据二维数组中的数据进行加载
    int[][] data = new int[4][4];

    //记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;

    //定义一个变量，记录当前展示图片的路径
    String path = "mini_games\\image\\animal\\animal3\\";





    //定义一个二维数组，存储正确的数据
    int[][] win = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0},
    };

    //定义变量用来统计步数
    int step = 0;


    //创建选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登入");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");






    public GameJFame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据（打乱）
        initData();


        //初始化图片
        initImage();

        //设置是否显示，建议写在最后
        this.setVisible(true);

    }


    //初始化数据（打乱）
    private void initData() {
        //1.定义一个一维数组
        int[] Arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //2.打乱数组中数据的顺序
        //遍历数组,得到每一个元素，拿着每一个元素跟随机索引上的数据进行交换
        Random r = new Random();
        for (int i = 0; i < Arr.length; i++) {
            //获取随机索引
            int index = r.nextInt(Arr.length);
            //拿着遍历到的每一个数据，跟随机索引上的数据进行交换
            int temp = Arr[i];
            Arr[i] = Arr[index];
            Arr[index] = temp;
        }

        //3.给二维数组添加数据
        for (int i = 0; i < Arr.length; i++) {

            if (Arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
                data[i / 4][i % 4] = Arr[i];

        }

    }

    //初始化图片
    private void initImage() {
        //清空原本已经出现的所有图片
        this.getContentPane().removeAll();

        if(victory()){
            //显示胜利的图标
            JLabel winJLabel = new JLabel(new ImageIcon("mini_games\\image\\win.png"));
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);
        }


        JLabel stepCount = new JLabel("步数："+step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);


//        //创建一个图片ImageIcon的对象
//        ImageIcon icon1 = new ImageIcon("D:\\JAVA\\untitled7\\mini_games\\image\\animal\\animal3\\1.jpg");
//        //创建一个JLabel的对象（管理容器）
//        JLabel jLabel = new JLabel(icon1);
//        //指定图片位置
//        jLabel.setBounds(0,0,105,105);
//        //把管理容器添加到界面中
//        //this.add(jLabel);
//        this.getContentPane().add(jLabel);


        //细节：
        //先加载的图片在上面，后面加载的图片塞在下面。

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //获取要加载图片的序号
                int num = data[i][j];
                //创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));
                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(1));
                //把管理容器添加到界面中
                //this.add(jLabel);
                this.getContentPane().add(jLabel);
            }
        }

        //添加背景图片
        ImageIcon bg = new ImageIcon("mini_games\\image\\background.png");
        //创建一个JLabel的对象（管理容器）
        JLabel background = new JLabel(bg);
        //指定背景图片位置
        background.setBounds(40, 40, 508, 560);
        //把背景图片添加到界面中
        this.getContentPane().add(background);


        //刷新一下界面
        this.getContentPane().repaint();

    }


    private void initJMenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项的对象（功能 关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");



        //将每一个选项下面的条目添加到选择当中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //给条目添加绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);



        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);

        //取消默认的居中的设置，只有取消了才会安装XY轴的形式添加组件
        this.setLayout(null);
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松时会调用这个方法
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 65){
            //把界面中所有的图片删除
            this.getContentPane().removeAll();
            //加载第一张完整的图片
            JLabel all = new JLabel(new ImageIcon(path+"all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            //加载背景图片
            ImageIcon bg = new ImageIcon("mini_games\\image\\background.png");
            //创建一个JLabel的对象（管理容器）
            JLabel background = new JLabel(bg);
            //指定背景图片位置
            background.setBounds(40, 40, 508, 560);
            //把背景图片添加到界面中
            this.getContentPane().add(background);
            //刷新一下界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，如果胜利，此方法需要直接结束，不能再执行下面的移动代码了
        if(victory()){
            //结束方法
            return;
        }


        //对上，下，左，右进判断

        int code = e.getKeyCode();
        if (code == 37) {
            System.out.println("向左移动");

            if (y == 0) {
                return;
            }
            //逻辑：
            //把空白方块左方的数字往右移
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            //每移动一次，计数器就自增一次
            step++;
            //调用方法按照最新的数字加载图片
            initImage();



        } else if (code == 38) {
            System.out.println("向上移动");

            if (x == 0) {
                return;
            }

            //逻辑：
            //把空白方块上方的数字往下移
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            //每移动一次，计数器就自增一次
            step++;
            //调用方法按照最新的数字加载图片
            initImage();


        } else if (code == 39) {
            System.out.println("向右移动");

            if(y ==3){
                return;
            }

            //逻辑：
            //把空白方块右方的数字往左移
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            //每移动一次，计数器就自增一次
            step++;
            //调用方法按照最新的数字加载图片
            initImage();

        } else if (code == 40) {
            System.out.println("向下移动");

            if (x == 3) {
                //表示空白方块已经在最下方了，他的下方没有图片再移动了
                return;
            }
            //逻辑：
            //把空白方块下方的数字往上移
            //x,y 表示空白方块

            //把空白方块下方的数字赋值給空白方块
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            //每移动一次，计数器就自增一次
            step++;
            //调用方法按照最新的数字加载图片
            initImage();

        }else if(code ==65){
            initImage();
        }else if(code==87){
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0},
            };
            initImage();
        }


    }

    //判断data数组中的数据是否跟win数组中相同
    //如果全部相同，返回true,否则返回false.
    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if(data[i][j] != win[i][j]){
                    //只要有一个数据不一样就返回false
                    return false;
                }
            }
        }
        //循环结束表示数组遍历比较完毕，全都一样返回true
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //获取当前被点击条目的对象
        Object obj = e.getSource();
        //判断
        if(obj==replayItem){
            System.out.println("重新游戏");

            //计步器清零
            step = 0;
            //再次打乱二维数组中的数据
            initData();
            //重新加载图片
            initImage();


        }else if(obj==reLoginItem){
            System.out.println("重新登入");

            //关闭当前界面游戏
            this.setVisible(false);
            //打开登入界面
            new LoginJFrame();

        }else if(obj==closeItem){
            System.out.println("关闭游戏");

            //直接关闭虚拟机即可
            System.exit(0);

        }else if(obj==accountItem){
            System.out.println("公众号");

            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //创建一个管理图片的容器对象JLabel
            JLabel jLabel = new JLabel(new ImageIcon("mini_games\\image\\an.jpg"));
            //设置图片的位置和宽高
            jLabel.setBounds(0,0,258,258);
            //把图片添加到弹框当中
            jDialog.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog.setSize(344,344);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);

        }
    }
}
