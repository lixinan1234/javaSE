package com.an.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/14 15:02
 */
public class Student {
    public static void startStudentSystem() {
        //创建一个集合
        ArrayList<NewStudent> list = new ArrayList<>();

        loop:
        while (true) {
            //主页面
            System.out.println("-----------欢迎来到学生管理系统------------");
            System.out.println("1:  添加学生");
            System.out.println("2： 删除学生");
            System.out.println("3： 修改学生");
            System.out.println("4： 查询学生");
            System.out.println("5： 退出");

            //键盘录入输入对应的值
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要操作的号码：");
            String choose = sc.next();
            switch (choose) {
                case "1":
                    add(list);
                    break;
                case "2":
                    delete(list);
                    break;
                case "3":
                    update(list);
                    break;
                case "4":
                    query(list);
                    break;
                case "5":
                    System.out.println("已退出。。");
                    break loop;

                default:
                    System.out.println("没有这个选项！");
            }
        }
    }


    //添加学生：条件id唯一
    public static void add(ArrayList<NewStudent> list) {

        //利用空参构造先创建学生对象
        NewStudent s1 = new NewStudent();

        //用户输入要添加学生的数据
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入添加学生的id：");
            id = sc.next();
            boolean contains = contains(list, id);
            if(contains){
                System.out.println("此id已经存在");
            }else {
                s1.setId(id);
                break;
            }
        }


        System.out.println("请输入添加学生的姓名");
        String name = sc.next();
        s1.setName(name);

        System.out.println("请输入添加学生的年龄");
        String age = sc.next();
        s1.setAge(age);

        System.out.println("请输入添加学生的住址");
        String zhuZhi = sc.next();
        s1.setZhuZhi(zhuZhi);

        //把学生对象添加到集合当中
        list.add(s1);

        //提示一下用户
        System.out.println("学生信息添加成功。");

    }

    //删除学生
    public static void delete(ArrayList<NewStudent> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入想要删除的id:");
        String id = sc.next();

        int index = getIndex(list, id);
        if(index>=0){
            list.remove(index);
            System.out.println("id为：" + id +"的学生删除成功！");
        }else {
            System.out.println("id不存在，删除失败！");
        }

    }

    //修改学生
    public static void update(ArrayList<NewStudent> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入删除的学生id:");
        String id = sc.next();
        System.out.println("要修改的id");
        String id2 = sc.next();

        int index = getIndex(list, id);

        if (index==-1){
            System.out.println("要修改的id"+id+"不存在");
            return;
        }

        NewStudent newStudent = list.get(index);

        System.out.println("请输入要修改的姓名：");
        String newName = sc.next();
        newStudent.setName(newName);

        System.out.println("请输入要修改的年龄：");
        String newAge = sc.next();
        newStudent.setAge(newAge);


        System.out.println("请输入要修改的地址：");
        String newzhuZhi = sc.next();
        newStudent.setZhuZhi(newzhuZhi);

        System.out.println("学生信息修改成功！");

    }

    //查询学生
    public static void query(ArrayList<NewStudent> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            //结束方法
            return;
        }
        //表头信息
        System.out.println("id\t\t姓名\t年龄\t家庭住址      ");
        for (int i = 0; i < list.size(); i++) {
            NewStudent newStudent = list.get(i);
            System.out.println(newStudent.getId() + "\t" + newStudent.getName() + "\t" + newStudent.getAge() + "\t" + newStudent.getZhuZhi());
        }

    }


    //判断id在集合中是否存在
    public static boolean contains(ArrayList<NewStudent> list, String id) {
        //遍历学生对象后，获取Id并进行判断
        for (int i = 0; i < list.size(); i++) {
                //拿到学生对象后，获取Id进行判断
            NewStudent stu = list.get(i);
            String id1 = stu.getId();
            if (id1.equals(id)) {
                //存在，true,不存在false
                return true;
            }
        }
        return false;
    }

    public static int getIndex(ArrayList<NewStudent> list, String id){
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //得到每个学生对象
            NewStudent newStudent = list.get(i);
            //得到每一个学生对象的id
            String id1 = newStudent.getId();
            //拿着集合中的学生id跟查询的id进行比较
            if(id1.equals(id)){
                //如果一样，那么就返回索引
                return i;
            }
        }
        //当循环结束后还没有找到，就表示不存在，返回-1
        return -1;
    }
}
