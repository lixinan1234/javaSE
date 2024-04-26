package com.object;

import java.util.StringJoiner;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2024/1/12 21:01
 */
public class User implements Cloneable{
    private int id;//游戏角色
    private String username;//用户名
    private String password;//密码
    private String path;//游戏图片
    private int[] data;//游戏进度

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }


    public String toString() {
        return "角色编号：" + id + ", 用户名： " + username + ", 密码 ：" + password + ", 游戏图片： " + path + ", 进度： " + arrToString();
    }

    public String arrToString() {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //克隆
        return super.clone();
    }
}
