package com.mutuelle.project.dao;

import com.mutuelle.project.model.Client;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientDAOTest {

    List<Client> clientList = new ArrayList<>();
    ClientDAO clientDAO = new ClientDAO();
    Client clientTest =  new Client("77-38615",  "EE56868", null,  "mohamed", "grando","0676565778" , "test@gmail.com",  "123 hey riyad",  "bolll" ,  LocalDate.parse("2021-10-10"), 5, LocalDate.now());

    @Test
    void getAllClient() {
        assertNotEquals(clientList,clientDAO.getAllClient());
    }

    @Test
    void find() {
        assertNotEquals(clientList,clientDAO.find(3));
    }

    @Test
    void findClient() {
        assertNotEquals(clientList,clientDAO.findClient("77-38615",  "EE56887", null,"test@gmail.com"));
    }

}