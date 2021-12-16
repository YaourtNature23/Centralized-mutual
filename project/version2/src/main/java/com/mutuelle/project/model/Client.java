package com.mutuelle.project.model;

import java.util.Date;

public class Client {
    private String NumberPadge;
    private String ComapnyName;
    private Date startDate;
    private String firstName;
    private String name;
    private String cin;
    private String Phone;
    private String email;
    private String adress;

    public Client(String numberPadge, String comapnyName, Date startDate, String firstName, String name, String cin, String phone, String email, String adress) {
        NumberPadge = numberPadge;
        ComapnyName = comapnyName;
        this.startDate = startDate;
        this.firstName = firstName;
        this.name = name;
        this.cin = cin;
        Phone = phone;
        this.email = email;
        this.adress = adress;
    }

    public Client() {
    }

    public String getNumberPadge() {
        return NumberPadge;
    }

    public void setNumberPadge(String numberPadge) {
        NumberPadge = numberPadge;
    }

    public String getComapnyName() {
        return ComapnyName;
    }

    public void setComapnyName(String comapnyName) {
        ComapnyName = comapnyName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
