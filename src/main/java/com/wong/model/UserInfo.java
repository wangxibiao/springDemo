package com.wong.model;

public class UserInfo {
    private Integer id;
    private String name;
    private Integer age;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserInfo() {
    }

    public UserInfo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
