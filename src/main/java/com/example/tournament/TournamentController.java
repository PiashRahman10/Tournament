package com.example.tournament;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.*;
import java.io.ObjectOutputStream;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

public class TournamentController {
    @FXML
    public Stage stage;
    @FXML
    public Scene scene;
    @FXML
    public Parent root;
    @FXML
    private Button loginbutton;

    @FXML
    private PasswordField loginpasswordfield;

    @FXML
    private Label loginpasswordlabel;

    @FXML
    private Label loginregistertextlabel;

    @FXML
    private Label logintournamentlabel;

    @FXML
    private TextField loginusernamefield;

    @FXML
    private Label loginusernamelabel;

    @FXML
    private Button registerbutton;

    @FXML
    private PasswordField registerconfirmpassword;

    @FXML
    private TextField registeremailfield;

    @FXML
    private PasswordField registerpassword;

    @FXML
    private TextField registerfullname;

    @FXML
    private Label registertournamentlabel;

    @FXML
    private TextField registerusernamefield;

    @FXML
    private Label registerwarninglabel;

    @FXML
    private Label warninglabel;

    @FXML
    void Loginaction(ActionEvent event) throws IOException {
        System.out.println("hello");
       root = FXMLLoader.load(getClass().getResource("second.fxml"));
        //root = FXMLLoader.load(Tournament.class.getResource("second.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
//        stage = (Stage)loginbutton.getScene().getWindow();
//        stage.setScene(new Scene(root));


    }

    @FXML
    void registeraction(ActionEvent event) throws IOException {
        String Fullname=registerfullname.getText();
         String Username=registerusernamefield.getText();
        String Email=registeremailfield.getText();
        String password=registerpassword.getText();

        user s = new user(Fullname,Username,Email,password);
      // HashMap<String,user> map=new HashMap<>();
      //  map.put(Username,new user(Fullname,Username,Email,password));
        FileOutputStream f=new FileOutputStream("src/main/java/com/example/tournament/Register_info.txt",true);
//        File file=new File("src/main/java/com/example/tournament/List");
//         FileWriter filewrite=new FileWriter(file,true);
//        filewrite.write(Username+"\n");
//        filewrite.write("\n");
//        filewrite.close();
        Formatter formatter=new Formatter("src/main/java/com/example/tournament/List");
        formatter.format("%s \r\n",Username);
        formatter.close();
        ObjectOutputStream ob=new ObjectOutputStream(f);
        ob.writeObject(s);
        ob.close();

        root = FXMLLoader.load(Tournament.class.getResource("second.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

}
