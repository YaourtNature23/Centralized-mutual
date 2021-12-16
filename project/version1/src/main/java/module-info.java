module com.example.project {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires json.simple;
    requires httpcore;
    requires httpclient;
    requires jackson.databind;
    requires com.google.gson;

    opens com.mutuelle.project to javafx.fxml;
    exports com.mutuelle.project;
    exports com.mutuelle.project.controller;
    opens com.mutuelle.project.controller to javafx.fxml;
}