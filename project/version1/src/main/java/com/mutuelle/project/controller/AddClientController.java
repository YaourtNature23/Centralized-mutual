package com.mutuelle.project.controller;

import com.mutuelle.project.implement.ClientImplement;
import com.mutuelle.project.model.Client;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class AddClientController {
    @FXML
            private TextField numberBadge;
    @FXML
            private TextField companyName;
    @FXML
            private DatePicker date;
    @FXML
            private TextField firstName;
    @FXML
            private TextField name;
    @FXML
            private TextField cin;
    @FXML
            private TextField phone;
    @FXML
            private TextField email;
    @FXML
            private TextField adress;
    @FXML
    private Label message;
    public void addClient() throws FileNotFoundException {

        //System.out.println(this.numberBadge.getText()+" "+dateUp+" "+this.adress.getText()+" "+this.cin.getText()+" "+this.companyName.getText()+" "+this.firstName.getText()+" "+this.name.getText()+" "+this.phone.getText()+" "+this.email.getText());
        if ((this.numberBadge.getText().isEmpty() || this.date.getValue() == null || this.adress.getText().isEmpty() || this.firstName.getText().isEmpty() || this.name.getText().isEmpty() || this.phone.getText().isEmpty() || this.companyName.getText().isEmpty() || this.cin.getText().isEmpty() || this.email.getText().isEmpty())){
            this.message.setText("Please fill all the fields");
        }else{
            this.message.setText("");
            LocalDate ld = this.date.getValue();
            Calendar c =  Calendar.getInstance();
            c.set(ld.getYear(), ld.getMonthValue(), ld.getDayOfMonth());
            Date dateUp = c.getTime();

            ClientImplement clientImplement = new ClientImplement();
            Client client = new Client(this.numberBadge.getText(),this.companyName.getText(),dateUp, this.firstName.getText(), this.name.getText(), this.cin.getText(), this.phone.getText(),this.email.getText(),this.adress.getText());
            System.out.println(client.getAdress());
            clientImplement.addClientInFile(client);
    }}
}
