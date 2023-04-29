module com.example.tournament {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.tournament to javafx.fxml;
    exports com.example.tournament;
}