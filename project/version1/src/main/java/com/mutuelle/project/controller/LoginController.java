package com.mutuelle.project.controller;

import com.mutuelle.project.AppApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoginController {
    @FXML
    private Button button_login;
    @FXML
    private TextField input_email;
    @FXML
    private PasswordField input_password;
    @FXML
    private Label message;

    public void Login() throws IOException {
        AppApplication ap = new AppApplication();
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("C:\\Users\\adm\\Desktop\\project\\project\\src\\main\\resources\\com\\mutuelle\\project\\assets\\fonctionnaire.json"))
        {
            Object obj = jsonParser.parse(reader);

            JSONArray fonctionnaireList = (JSONArray) obj;
            System.out.println(fonctionnaireList);

            for (Object o : fonctionnaireList) {
                JSONObject fonctionnaire = (JSONObject) o;
                String email = (String) fonctionnaire.get("email");
                String password = (String) fonctionnaire.get("password");

                if ((this.input_email.getText().isEmpty() || this.input_password.getText().isEmpty())) {
                    message.setText("Please fill all the fields");
                    break;
                } else if (email.equalsIgnoreCase(this.input_email.getText()) && password.equals(this.input_password.getText())) {
                    message.setText("Success!");
                    ap.changeScene("forms/dashboard-view.fxml");
                    break;
                } else {
                    message.setText("Invalide login ,Try again !");
                }
            }


        } catch (FileNotFoundException | ParseException e) {
            e.printStackTrace();
        }
        ap.changeScene("forms/dashboard-view.fxml");
    }
}