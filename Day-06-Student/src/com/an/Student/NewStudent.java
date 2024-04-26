package com.an.Student;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/14 15:15
 */
public class NewStudent {
    private String id;
    private String name;
    private String age;
    private String zhuZhi;

    public NewStudent() {
    }

    public NewStudent(String id, String name, String age, String zhuZhi) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.zhuZhi = zhuZhi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getZhuZhi() {
        return zhuZhi;
    }

    public void setZhuZhi(String zhuZhi) {
        this.zhuZhi = zhuZhi;
    }
}
