package com.an.ObjectOrented;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/10/29 15:07
 */
public class User {
    //属性
    private String user;
    private int password;
    private String mailbox;
    private String sex;
    private int age;



    public User() {
    }

    public User(String user, int password, String mailbox, String sex, int age) {
        this.user = user;
        this.password = password;
        this.mailbox = mailbox;
        this.sex = sex;
        this.age = age;
    }

    /**
     * 获取
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * 设置
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * 获取
     * @return password
     */
    public int getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * 获取
     * @return mailbox
     */
    public String getMailbox() {
        return mailbox;
    }

    /**
     * 设置
     * @param mailbox
     */
    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
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

}
