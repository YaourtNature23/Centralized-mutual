package com.mutuelle.project.dao;

import com.mutuelle.project.connection.DbCnnection;

import java.sql.Connection;

public abstract class IDAO<T> {

    public DbCnnection dbCnnection = new DbCnnection();
    public Connection connectDB = dbCnnection.getConnection("mutuelle_centralisee","root","");

    public abstract T find(int id);

    public abstract T create(T obj);

    public abstract T update(T obj);

    public abstract void delete(T obj);
}
