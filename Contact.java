package com.example.contacts;

public class Contact {

    private long id;
    private String name;
    private String phone;
    private String birthday;

    Contact(String name, String phone, String birthday) {
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
    }

    public Contact(long id, String name, String phone, String birthday) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
    }

    public Contact() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
