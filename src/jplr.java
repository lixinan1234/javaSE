/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/9 17:52
 */
//1.导包，找到Scanner这个类在哪
//书写要注意：要写在类定义的上面
import java.util.Scanner;

public class jplr {
    public static void main(String[] args){
        //2.创建对象--表示我要开始用Scanner这个类
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数");
        //3.接收数据
        //变量i记录了键盘录入的数据
        int first = sc.nextInt();
        System.out.println("请再输入一个整数");
        int second = sc.nextInt();

        System.out.println(first+second);

    }
}
