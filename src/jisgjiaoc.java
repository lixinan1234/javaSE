/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/6/6 16:10
 */
public class jisgjiaoc {
    public static void main(String[] args){
        //一开始没有乘客
        int count = 0;
        //第一站：上去了一位乘客
        //在原有的基础上+1
        count = count + 1;
        //第二站：上去了两位乘客，下去了一位乘客
        count = count + 2 - 1;
        //第三站：上去了两位乘客，下来了一位乘客
        count = count + 2 - 1;
        //第四站：下去了一位乘客
        count = count - 1;
        //第五站：上去了一位乘客
        count = count + 1;
        //最终车上一共有几个人
        System.out.println(count);
    }
}
