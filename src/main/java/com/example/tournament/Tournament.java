package com.example.tournament;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Tournament extends Application {
    public String Username, Password, Email;
    public int Phone_no;
    public Tournament(String Username, String Email, int Phone_no, String Password){
        this.Username = Username;
        this.Email = Email;
        this.Phone_no = Phone_no;
        this.Password = Password;
    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Tournament.class.getResource("Tournament.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Welcome to the Tournament site!!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}