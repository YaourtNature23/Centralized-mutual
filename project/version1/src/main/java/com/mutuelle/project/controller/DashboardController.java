package com.mutuelle.project.controller;

import com.mutuelle.project.AppApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class DashboardController {
    @FXML
    private Button btn_add;

    @FXML
    private Button btn_show;

    public void showclient() throws IOException {
        AppApplication appApplication = new AppApplication();
        appApplication.changeScene("forms/showclients-view.fxml");
    }

    public void addClient() throws IOException {
        AppApplication appApplication = new AppApplication();
        appApplication.changeScene("forms/addclient-view.fxml");
    }
}
