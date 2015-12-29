package com.zenin.mybatis.entity;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("User")
public class User implements Serializable {
    private static final long serialVersionUID = 8512652678324069586L;

    private int id;
    private String userName;
    private int userAge;
    private String userAddress;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", userName='" + userName + '\'' + ", userAge=" + userAge + ", userAddress='" + userAddress
            + '\'' + '}';
    }
}
