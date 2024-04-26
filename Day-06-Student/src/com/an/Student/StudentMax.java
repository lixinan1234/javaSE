package com.an.Student;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/16 14:41
 */
public class StudentMax {
    public static void main(String[] args) {

        //创建一个集合,不能写在方法里面
        ArrayList<NewStudentMax> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("欢迎来到学生管理系统！");
            System.out.println("请选择操作1登入 2注册 3忘记密码 4退出");
            //键盘录入：输入对应要操作的数字
            System.out.println("请输入1，2，3对应的号码");
            String choose = sc.next();
            switch (choose) {
                case "1":
                    login(list);
                    break;
                case "2":
                    register(list);
                    break;
                case "3":
                    forgetPassword(list);
                    break;
                case "4":
                    System.out.println("谢谢使用，再见");
                    System.exit(0);

                default:
                    System.out.println("没有这个选项");
            }
        }
    }

    //注册
    public static void register(ArrayList<NewStudentMax> list) {

        //创建一个空参对象
        NewStudentMax s1 = new NewStudentMax();

        //1.键盘录入用户名username
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入用户名： ");
            String username = sc.next();

            boolean b = checkUsername(username);
            if (!b) {
                System.out.println("用户名格式不满足，需要重新输入");
            }


            //校验用户名唯一
            boolean contains = contains(list, username);
            if (contains) {
                System.out.println("用户名" + username + "已存在，请重新输入");
            } else {
                //不存在，则添加集合里面
                System.out.println("用户名" + username + "可用");
                s1.setUsername(username);
                break;
            }
        }


        //2.键盘录入两次密码，是否一致
        while (true) {
            System.out.println("输入密码: ");
            String password1 = sc.next();
            System.out.println("请再次确认密码密码: ");
            String password2 = sc.next();
            if (password1.equals(password2)) {
                s1.setPassword(password1);
                break;
            } else {
                System.out.println("两次密码不一样，请重新输入");
            }
        }

        //3.键盘录入身份证号码
        //长度为18
        //不能以0为开头
        //前17位，必须是数字
        //最后一位可以数字，也可以是大写X或者小写x
        while (true) {
            System.out.println("输入身份证号码：");
            String personID = sc.next();
            boolean flag = checkPersonID(personID);
            if (flag) {
                s1.setIdentityCard(personID);
                System.out.println("身份证号码输入正确！");
                break;
            } else {
                System.out.println("身份证号码不正确！");
            }
        }

        //4.键盘录入手机号码
        //长度为11位
        //不能以0为开头
        //必须是数字
        while (true) {
            System.out.println("输入手机号码：");
            String phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag) {
                System.out.println("手机号输入正确");
                s1.setPhoneNumber(phoneNumber);
                break;
            } else {
                System.out.println("手机号输入失败");
            }
        }

        list.add(s1);
        System.out.println("注册成功！！！！");

    }


    //登入
    public static void login(ArrayList<NewStudentMax> list) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            //键盘录入用户名
            System.out.println("请输入用户名：");
            String username = sc.next();
            //判断用户名是否存在
            boolean flag = contains(list, username);
            if (!flag) {
                System.out.println("用户名" + username + "不存在，请先注册");
                return;
            }

            //键盘录入密码
            System.out.println("请输入密码");
            String password = sc.next();

            //键盘录入验证码
            while (true) {
                String rightCode = getCode();
                System.out.println("验证码为" + rightCode);
                System.out.println("请输入验证码");
                String code = sc.next();
                if (code.equalsIgnoreCase(rightCode)) {
                    System.out.println("验证码正确！");
                    break;
                } else {
                    System.out.println("验证码错误，请重新输入！");
                    continue;
                }
            }

            //验证用户名和密码是否正确
            //集合中是否包含用户名和密码
            //定义 一个方法验证用户名和密码是否正确

            //封装思想的应用：
            //我们可以把一些零散的数据，封装成一个对象
            //以后传递参数的时候，只要传递一个整体就可以了，不需要管这些零散的数据。
            NewStudentMax useInfo = new NewStudentMax(username, password, null, null);
            boolean result = checkUserInfo(list, useInfo);
            if (result) {
                System.out.println("登入成功，可以使用学生管理系统！");
                //创建对象调用方法，启动学生管理系统
                Student ss = new Student();
                ss.startStudentSystem();
                break;
            } else {
                System.out.println("登入失败，用户名或者密码错误！");
                if (i == 2) {
                    System.out.println("当前账号" + username + "被锁定，请联系安帅哥：15979346712");
                    //当前账号锁定之后，直接结束方法即可
                    return;
                } else {
                    System.out.println("用户名或者密码错误，还剩下" + (2 - i) + "次机会");
                }
            }

        }


    }



    //忘记密码
    public static void forgetPassword(ArrayList<NewStudentMax> list) {
        Scanner sc = new Scanner(System.in);
        //判断用户名是否存在
        System.out.println("请输入用户名：");
        String username = sc.next();
        boolean flag = contains(list, username);
        if (!flag) {
            System.out.println("用户名" + username + "不存在，请先注册");
            return;
        }

        //键盘录入身份证号码和手机号码
        System.out.println("请输入身份证号码");
        String personID = sc.next();
        System.out.println("请输入手机号码");
        String phoneNumber  = sc.next();

        //需要把用户对象通过索引先获取出来
        int index = findIndex(list,username);
        NewStudentMax newStudentMax = list.get(index);
        //比较用户对象中的手机号码和身份证号码是否相同
        if(!(newStudentMax.getIdentityCard().equalsIgnoreCase(personID) &&newStudentMax.getPhoneNumber().equals(phoneNumber))){
            System.out.println("身份证号码或者手机号码输入错误，不能修改密码");
            return;
        }

        //当代码执行到这里，表示所有的数据全部验证成功，直接修改即可
        String password;
        while (true) {
            System.out.println("请输入新的密码：");
            password = sc.next();
            System.out.println("请再次输入新的密码");
            String againPassword = sc.next();
            if(password.equals(againPassword)){
                System.out.println("两次密码输入一致");
                break;
            }else{
                System.out.println("两次密码输入不一致，请重新输入");
                continue;
            }
        }

        //直接修改即可
        newStudentMax.setPassword(password);
        System.out.println("密码修改成功");

    }

    private static int findIndex(ArrayList<NewStudentMax> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            NewStudentMax newStudentMax = list.get(i);
            if(newStudentMax.getUsername().equals(username)){
                return i;
            }
        }
        return -1;
    }


    //判断是否存在用户名
    public static boolean contains(ArrayList<NewStudentMax> list, String username) {
        //遍历用户名对象后，获取Id并进行判断
        for (int i = 0; i < list.size(); i++) {
            //获取Id进行判断
            NewStudentMax newStudentMax = list.get(i);
            String username1 = newStudentMax.getUsername();
            if (username1.equals(username)) {
                return true;
            }
        }
        return false;
    }

    //判断用户名是否满足条件
    public static boolean checkUsername(String username) {
        //用户名长度必须在3~15之间
        int length = username.length();
        if (length < 3 || length > 15) {
            System.out.println("用户名长度须在3~15之间,不能是纯数字，需要数字加字母");
            return false;
        }

        //当代码执行到这里表示用户名的长度是符合要求的

        //继续校验：只能是字母加数字的组合
        //循环得到username里面的每一个字符，如果有一个字符不是字母或者是数字，那么就返回false
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }
        //当代码执行到这里表示用户名满足两个要求：
        //1.长度满足
        //2.内容也满足

        //但是不能是纯数字
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;
            }
        }
        return count > 0;
    }

    //校验身份证号码的需求是否满足
    private static boolean checkPersonID(String personID) {
        //校验:长度为18
        if (personID.length() != 18) {
            System.out.println("请输入18位的身份证号码");
            return false;
        }
        //代码执行到这里，说明身份证号码长度正确
        //校验:不能以0为开头
        char c = personID.charAt(0);
        if (c == 0) {
            System.out.println("身份证号码不能以0开头");
            return false;
        }
        //代码执行到这里，说明身份证号码开头不是0
        //校验：前17位，必须是数字
        for (int i = 0; i < personID.length() - 1; i++) {
            char length = personID.charAt(i);
            if (!(length >= '0' && length <= '9')) {
                System.out.println("身份证前17位必须是数字");
                return false;
            }
        }

        //校验：最后一位可以数字，也可以是大写X或者小写x
        char c1 = personID.charAt(personID.length() - 1);
        if ((c1 >= '0' && c1 <= '9') || (c1 == 'X') || (c1 == 'x')) {
            return true;
        } else {
            System.out.println("身份证号码最后一位是数字，或者是大写X或者小写x");
            return false;
        }
    }

    //校验手机号是否满足条件
    private static boolean checkPhoneNumber(String phoneNumber) {
        //长度为11位
        if (phoneNumber.length() != 11) {
            System.out.println("请输入1位数的手机号");
            return false;
        }
        //不能以0为开头
        char c = phoneNumber.charAt(0);
        if (c == 0) {
            System.out.println("手机号不能以0开头");
            return false;
        }
        //必须是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c1 = phoneNumber.charAt(i);
            if (!(c1 >= '0' && c1 <= '9')) {
                System.out.println("手机号必须是数字");
                return false;
            }
        }
        return true;
    }


    //生成一个验证码
    private static String getCode() {
        //1.创建一个集合添加所有的大写和小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));//添加a~z的字符到集合
            list.add((char) ('A' + i));//添加A~Z的字符到集合
        }
        StringBuilder sb = new StringBuilder();
        //2.要随机抽取4个字符
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随机索引
            int index = r.nextInt(list.size());
            //利用随机索引获取字符
            char character = list.get(index);
            sb.append(character);
        }

        //3.把一个随机数字添加到末尾
        int number = r.nextInt(10);
        sb.append(number);

        //4.如果我们要修改字符串中的内容
        //先把字符串编程字符数组，在数字中修改，然后再创建一个新的字符串
        char[] arr = sb.toString().toCharArray();
        //拿着最后一个索引，跟随机索引进行交换
        int randomIndex = r.nextInt(arr.length);
        //最大索引指向的元素 跟随机索引指向的元素进行交换
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return new String(arr);
    }

    //判断用户名和密码是否正确
    private static boolean checkUserInfo(ArrayList<NewStudentMax> list, NewStudentMax useInfo) {
        for (int i = 0; i < list.size(); i++) {
            NewStudentMax newStudentMax = list.get(i);
            if (newStudentMax.getUsername().equals(useInfo.getUsername()) && newStudentMax.getPassword().equals(useInfo.getPassword())) {
                return true;
            }
        }
        return false;
    }

}
