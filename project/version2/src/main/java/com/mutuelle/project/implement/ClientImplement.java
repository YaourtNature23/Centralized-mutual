package com.mutuelle.project.implement;

import com.mutuelle.project.interfaces.ClientInterface;
import com.mutuelle.project.model.Client;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.google.gson.Gson;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClientImplement implements ClientInterface {

    @Override
    public Client getClient() {
        return null;
    }

    @Override
    public List<Client> getListClients() {
        return null;
    }

    @Override
    public Client addClient() {
        return null;
    }
}
