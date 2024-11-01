package com.library.client;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginScreen extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label lblUsername = new Label("Username:");
        TextField txtUsername = new TextField();
        Label lblPassword = new Label("Password:");
        PasswordField txtPassword = new PasswordField();
        Button btnLogin = new Button("Login");
        Button btnRegister = new Button("Register");


        VBox vbox = new VBox(10, lblUsername, txtUsername, lblPassword, txtPassword, btnLogin, btnRegister);
        Scene scene = new Scene(vbox, 300, 200);


        btnLogin.setOnAction(e -> {

        });

        btnRegister.setOnAction(e -> {

        });


        primaryStage.setTitle("Library Management System - Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
