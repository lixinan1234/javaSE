/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/8 10:15
 */
public class sjlxlianxi {
    public static void main(String[] args){
        //定义变量记录姓名
        String name = "黑马谢广坤";
        //定义变量记录年龄
        int age = 18;
        //定义变量记录性别
        char  gender = '男';
        //定义变量记录身高
        double  stature = 180.1;
        //定义变量记录是否单身
        boolean single = true;

        //输出变量的值
        System.out.println("姓名:"+name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(stature);
        System.out.println(single);

        System.out.println("---------------练习2输出电影信息--------------");

        //定义变量记录电影名字
        String filmtitle = "送初恋回家";
        //定义变量记录电影主演
        String portagonist = "刘鑫 张雨提 高媛";
        int year = 2020;
        double score = 9.0;
        System.out.println(filmtitle);
        System.out.println("主演:"+portagonist);
        System.out.println("年份:"+year);
        System.out.println("评分:"+score);

        System.out.println("---------------练习3输出商品信息--------------");
        double price = 5299.00;
        String brand = "HAUWEI Mate40 pro";
        System.out.println(price);
        System.out.println(brand);
    }
}
