package com.example.tournament;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class secondController {
    @FXML
    public Stage stage;
    public Scene scene;
    public Parent root;
    public void secondgamesaction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Tournament.class.getResource("DemoGames.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void secondtournamentaction(ActionEvent event){

    }
    public void secondbacksaction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Tournament.class.getResource("Tournament.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
