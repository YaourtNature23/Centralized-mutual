package com.mutuelle.project.controller;

import com.mutuelle.project.implement.ClientImplement;
import com.mutuelle.project.model.Client;

import java.io.FileNotFoundException;
import java.util.Date;

public class AddClientController {
    ClientImplement clientImplement = new ClientImplement();
    Client client = new Client("hsgdh","company",new Date(),"test", "test","test","test","email","adress");

    public void test() throws FileNotFoundException {
        System.out.println(client.getAdress());
        clientImplement.addClientInFile(client);
    }
}
