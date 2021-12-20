package com.mutuelle.project.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbCnnection {
    public Connection databaseLink;

    private String databaseName;
    private String databaseUser;
    private String databasePassword;

    public Connection getDatabaseLink() {
        return databaseLink;
    }

    public DbCnnection(String databaseName, String databaseUser, String databasePassword) {
        this.databaseName = databaseName;
        this.databaseUser = databaseUser;
        this.databasePassword = databasePassword;
    }

    public void setDatabaseLink(Connection databaseLink) {
        this.databaseLink = databaseLink;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getDatabaseUser() {
        return databaseUser;
    }

    public void setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

    public void setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
    }

    public Connection getConnection(){
        String url = "jdbc:mysql://localhost/"+this.databaseName;
        try{
            //mysql.cj.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url,this.databaseUser,this.databasePassword);
        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return databaseLink;
    }
}
