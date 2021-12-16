package com.mutuelle.project.model;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.parser.ParseException;

public class ReadJSONE {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

    }

    private static void parseFonctionnaireObject(JSONObject fonctionnaire)
    {
        //Get employee object within list
        JSONObject fonctionnaireObject = (JSONObject) fonctionnaire.get("fonctionnaire");

        //Get fonctionnaire firstname
        String firstName = (String) fonctionnaireObject.get("firstname");
        System.out.println(firstName);

        //Get fonctionnaire lastname
        String lastName = (String) fonctionnaireObject.get("lastname");
        System.out.println(lastName);

        //Get fonctionnaire entity
        String entity = (String) fonctionnaireObject.get("entity");
        System.out.println(entity);

        //Get fonctionnaire email
        String email = (String) fonctionnaireObject.get("email");
        System.out.println(email);

        //Get fonctionnaire cin
        String cin = (String) fonctionnaireObject.get("cin");
        System.out.println(cin);

        //Get fonctionnaire website phone
        String phone = (String) fonctionnaireObject.get("phone");
        System.out.println(phone);

        //Get fonctionnaire website phone
        String password = (String) fonctionnaireObject.get("password");
        System.out.println(password);
    }
}
