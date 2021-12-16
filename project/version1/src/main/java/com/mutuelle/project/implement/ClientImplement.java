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

public class ClientImplement implements ClientInterface {
    private JSONObject jsonObject;
    private JSONArray jsonArray;
    private  JSONArray clientList;
    @Override
    public void addClientInFile(Client c) {
       this.jsonObject = new JSONObject();
       this.jsonArray = new JSONArray();
        this.clientList = new JSONArray();
        jsonObject.put("numberPadge",c.getNumberPadge());
        jsonObject.put("comapnyName",c.getComapnyName());
        jsonObject.put("startDate",c.getStartDate().toString());
        jsonObject.put("firstName",c.getFirstName());
        jsonObject.put("name",c.getName());
        jsonObject.put("cin",c.getCin());
        jsonObject.put("phone",c.getPhone());
        jsonObject.put("email",c.getEmail());
        jsonObject.put("adress",c.getAdress());

        System.out.println(jsonObject);
        //jsonArray.add(jsonObject);

        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("C:\\Users\\adm\\Desktop\\Centralized-mutual\\project\\version1\\src\\main\\resources\\com\\mutuelle\\project\\assets\\myJson.json"))
        {
            Object obj = jsonParser.parse(reader);
            this.clientList = (JSONArray) obj;
            this.clientList.add(this.jsonObject);
            System.out.println("this is client list ===>"+clientList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            //e.printStackTrace();
            System.out.println("error "+e.getMessage());
        }
        System.out.println("The JSON representation of Object mobilePhone is ");

        //System.out.println(new Gson().toJson(c));
        try(FileWriter fileWriter = new FileWriter("C:\\Users\\adm\\Desktop\\Centralized-mutual\\project\\version1\\src\\main\\resources\\com\\mutuelle\\project\\assets\\myJson.json")){
            fileWriter.write(this.clientList.toJSONString());
            fileWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("jsonObject ===>"+this.jsonObject);

    }

    @Override
    public void filterClient(String number) {

    }

    @Override
    public ArrayList<Client> readClients() {
        return null;
    }
}
