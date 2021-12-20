package com.mutuelle.project.model;

public class Fonctionnaire {
    private int official_id;
    private String firstname;
    private String lastname;
    private String cin;
    private String phone;
    private String email;
    private String password;
    private Entity entity;

    public Fonctionnaire() {

    }

    public Fonctionnaire(int official_id, String firstname, String lastname, String cin, String phone, String email, String password, Entity entity) {
        this.official_id = official_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.cin = cin;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.entity = entity;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public int getOfficial_id() {
        return official_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Fonctionnaire{" +
                "official_id=" + official_id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", cin='" + cin + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", entity=" + entity +
                '}';
    }
}
