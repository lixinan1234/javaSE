package com.an.Student;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/16 15:19
 */
public class NewStudentMax {
    private String username;
    private String password;
    private String identityCard;
    private String phoneNumber;

    public NewStudentMax() {
    }

    public NewStudentMax(String username, String password, String identityCard, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
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

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
