package Stream.one;

import java.util.ArrayList;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/14 16:05
 */
public class stream1 {
    public static void main(String[] args) {
        /*
        创建一个集合添加元素，完成以下需求：
        1.把所有以“张”开头的元素存储到新的集合中
        2.把“张”开头的，长度为3的元素再存储到新的集合中
        3.遍历打印结果
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵云");
        list.add("李永波");
        list.add("张三丰");
        list.add("张杰");

        //1.把所有以“张”开头的元素存储到新的集合中
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list) {
            //判断是否以张开头
            if(s.startsWith("张")){
                list2.add(s);
            }
        }
        System.out.println(list2);

        //2.把“张”开头的，长度为3的元素再存储到新的集合中
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                if(s.length()==3){
                    list3.add(s);
                }
            }
        }
        //3.遍历打印结果
        for (String s : list3) {
            System.out.println(s);
        }


        //stream流
        list2.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));
    }
}
