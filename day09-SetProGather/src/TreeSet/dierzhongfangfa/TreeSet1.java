package TreeSet.dierzhongfangfa;

import java.util.TreeSet;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/7 14:22
 */
public class TreeSet1 {
    public static void main(String[] args) {
        /*
        需求：请自行选择比较器排序和自然排序两种方式
        要求：存入四个字符串，“c”,"ab","df",""que"
        按照长度排序，如果一样长则按照首字母排序
         */

        //1.创建一个集合
        //o1:表示要添加的元素
        //o2:表示已经在红黑树存在的元素
        //返回规则和以前一样
        TreeSet<String> str = new TreeSet<>((o1,o2)-> {
                //按照长度进行排序
                int i = o1.length() - o2.length();
                //如果长度一样长则按照首字母进行排序
                i = i==0? o1.compareTo(o2):i;
                return i;
            }
        );
        //2.添加元素
        str.add("c");
        str.add("ab");
        str.add("df");
        str.add("que");
        //3.打印字符串
        System.out.println(str);
    }
}
