package TreeSet.diyizhongfangfa;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/4/6 21:11
 */
public class TreeSetStudent implements Comparable<TreeSetStudent>{
    private String name;
    private int age;

    public TreeSetStudent() {
    }

    public TreeSetStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }



    public String toString() {
        return "TreeSetStudent{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(TreeSetStudent o) {
        //指定排序规则
        //只看年龄，我想要按照年龄的升序进行排序
        int i = this.getAge() - o.getAge();
        return i;
    }
}
