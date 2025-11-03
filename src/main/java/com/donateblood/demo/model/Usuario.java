package com.donateblood.demo.model;

public class Usuario {
private String username;
    private int age;
    private String bloodType;
    private String numPhone;
    private String email;
    private String address;
    private String password;

    public Usuario(){};
    
    public Usuario(String username, int age, String bloodType, String numPhone, String email, String address,String password) {
        this.username = username;
        this.age = age;
        this.bloodType = bloodType;
        this.numPhone = numPhone;
        this.email = email;
        this.address = address;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}