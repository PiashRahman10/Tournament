package com.example.tournament;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DemoGamesController {
    @FXML
    public Stage stage;
    public Scene scene;
    public Parent root;
    @FXML
    private Button DemoBackButton;

    @FXML
    private Button DemoCardGameButton;

    @FXML
    private Button DemoExitButton1;

    @FXML
    private Button DemoKBCButton;

    @FXML
    private Button DemoPongGameButton;

    @FXML
    void DemoBackAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Tournament.class.getResource("Second.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void DemoCardGameAction(ActionEvent event) {

    }

    @FXML
    void DemoExitAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void DemoKBCAction(ActionEvent event) {

    }

    @FXML
    void DemoPongButtonAction(ActionEvent event) {

    }

}
