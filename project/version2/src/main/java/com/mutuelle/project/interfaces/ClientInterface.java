package com.mutuelle.project.interfaces;

import com.mutuelle.project.model.Client;

import java.util.List;

public interface ClientInterface {
    public Client getClient();
    public List<Client> getListClients();
    public Client addClient();

}
