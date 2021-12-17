package com.mutuelle.project.controller;

import com.mutuelle.project.AppApplication;
import com.mutuelle.project.implement.ClientImplement;
import com.mutuelle.project.model.Client;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
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

    @FXML
    private Button btn_add;
    @FXML
    private Button btn_show;

// show clent
    @FXML
    private TableView<Client> tableView;
    @FXML
    private TableColumn<Client,String> cnumber;
    @FXML
    private TableColumn<Client,String> ccompanyName;
    @FXML
    private TableColumn<Client,Date> cdate;
    @FXML
    private TableColumn<Client,String> cfirstName;
    @FXML
    private TableColumn<Client,String> cname;
    @FXML
    private TableColumn<Client,String> ccin;
    @FXML
    private TableColumn<Client,String> telephon;
    @FXML
    private TableColumn<Client,String> cemail;
    @FXML
    private TableColumn<Client,String> cadress;


    public void showclientD() throws IOException {
        AppApplication appApplication = new AppApplication();
        appApplication.changeScene("forms/showclients-view.fxml");
    }

    public void addClientD() throws IOException {
        AppApplication appApplication = new AppApplication();
        appApplication.changeScene("forms/addclient-view.fxml");
    }

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

    public void showClient(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}
