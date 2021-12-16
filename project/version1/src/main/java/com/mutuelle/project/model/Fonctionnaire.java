package com.mutuelle.project.model;

public class Fonctionnaire {
    public Fonctionnaire() {
    }

    public Fonctionnaire(String firstName, String lastName, String cin, String phone, String email, String password, String entity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cin = cin;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.entity = entity;
    }

    private String firstName;
    private String lastName;
    private String cin;
    private String phone;
    private String email;
    private String password;
    private String entity;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    @Override
    public String toString() {
        return "Fonctionnaire{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cin='" + cin + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", entity='" + entity + '\'' +
                '}';
    }
}
