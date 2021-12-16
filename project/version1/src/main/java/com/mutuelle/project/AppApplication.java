package com.mutuelle.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AppApplication extends Application {
    private static Stage stg;
    @Override
    public void start(Stage stage) throws IOException {
        try {
            stg=stage;
            BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("forms/login-view.fxml"));
            Scene scene = new Scene(root,1098,476);
            scene.getStylesheets().addAll(AppApplication.class.getResource("assets/style.css").toExternalForm());
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void changeScene(String fxml) throws IOException {
        System.out.println(fxml);
        FXMLLoader fxmlLoader = new FXMLLoader(AppApplication.class.getResource(fxml));
        stg.setScene(new Scene(fxmlLoader.load()));
    }
    public static void main(String[] args) {
        launch();
    }
}