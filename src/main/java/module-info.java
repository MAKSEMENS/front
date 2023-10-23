module com.example.fronted {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fronted to javafx.fxml;
    exports com.example.fronted;
}