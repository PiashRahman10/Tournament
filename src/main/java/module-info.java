module com.example.tournament {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tournament to javafx.fxml;
    exports com.example.tournament;
}