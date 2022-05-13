module com.example.messengerserverjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.messengerserverjava to javafx.fxml;
    exports com.example.messengerserverjava;
}