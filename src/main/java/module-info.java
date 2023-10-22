module com.example.amusementpark {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.amusementpark to javafx.fxml;
    exports com.example.amusementpark;
}
