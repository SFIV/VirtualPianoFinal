module com.example.virtualpiano {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.example.virtualpiano to javafx.fxml;
    exports com.example.virtualpiano;
}