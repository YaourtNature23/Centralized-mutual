package com.mutuelle.project.interfaces;

import com.mutuelle.project.model.Client;

import java.util.ArrayList;

public interface ClientInterface {
    public void addClientInFile(Client c);
    public void filterClient(String number);
    public ArrayList<Client> readClients();


}
