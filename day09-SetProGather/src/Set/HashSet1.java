package Set;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/6 19:52
 */
public class HashSet1 {
    public static void main(String[] args) {
        //1.创建对象
        HashSetStudent s1 = new HashSetStudent("zhangsan",23);
        HashSetStudent s2 = new HashSetStudent("zhangsan",23);

        //2.如果没有重写hashCode方法，不同对象计算出的哈希值是不同的。
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
