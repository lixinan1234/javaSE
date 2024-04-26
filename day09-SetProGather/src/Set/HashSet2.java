package Set;

import java.util.HashSet;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/6 20:25
 */
public class HashSet2 {
    public static void main(String[] args) {
        /*
        需求：创建一个学生对象的集合，存储多个学生对象
        使用程序实现在控制台遍历该集合
        需求：学生对象的成员变量值相同，我们就认为是同一个对象
         */



        //1.创建三个学生对象
        HashSet<HashSetStudent> str = new HashSet<HashSetStudent>();
        HashSetStudent s1 = new HashSetStudent("廖乐乐",18);
        HashSetStudent s2 = new HashSetStudent("李新安",18);
        HashSetStudent s3 = new HashSetStudent("李新安",18);
        str.add(s1);//添加对象
        str.add(s2);
        str.add(s3);
        //2.遍历集合
        for (HashSetStudent s : str) {
            System.out.println(s);
        }
    }
}
