package com.example.tournament;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class user implements Serializable {
    public String name,username, Email, password;

    public user(String name,String username, String Email, String password) {
        this.Email = Email;
        this.username = username;
        this.password = password;
          this.name=name;
    }

    public String toString() {
        return "[Username: " + this.username + ", Email: " + this.Email + ",Phone: " + this.name + "]";
    }

    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("src/main/java/com/example/tournament/Register_info.txt");
            ObjectInputStream ob=new ObjectInputStream(fin);
             user u= (user)ob.readObject();
            System.out.println(u.toString());
            ob.close();


        } catch (Exception e) {
            System.out.println(e);

        }
    }

}