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
import java.util.*;

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
    ArrayList<String> list=new ArrayList<>();

    @FXML
    void Loginaction(ActionEvent event) throws IOException {
        try{
            File fl=new File("src/main/java/com/example/tournament/List");
            Scanner scn=new Scanner(fl);
            while (scn.hasNext()){
                String n=scn.next() ;
                String p=scn.next();
                if(n.equals(loginusernamefield.getText()) && p.equals(loginpasswordfield.getText())){
                    root = FXMLLoader.load(getClass().getResource("second.fxml"));
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }else {
                    registerwarninglabel.setText("wrong password or usename ");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void registeraction(ActionEvent event) throws IOException {
        String Fullname=registerfullname.getText();
         String Username=registerusernamefield.getText();
        String Email=registeremailfield.getText();
        String password=registerpassword.getText();
           if(Fullname.equals("")|| Username.equals("")||Email.equals("")||password.equals(""))  {
               registerwarninglabel.setText("Somthing went Wrong!! Please try again");
           }else {
               boolean k = list.contains(registertournamentlabel.getText());
               System.out.println(k);
               if(k==true){
                   registerwarninglabel.setText("This username is already exist!!");
               } else {

                       list.add(Username);
                       File file=new File("src/main/java/com/example/tournament/List");
                       FileWriter filewrite=new FileWriter(file,true);
                       filewrite.write(Username+" ");
                       filewrite.write(password+"\n");

                   root = FXMLLoader.load(Tournament.class.getResource("second.fxml"));
                   stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                   scene = new Scene(root);
                   stage.setScene(scene);
                   stage.show();
               }

           }

    }

}
