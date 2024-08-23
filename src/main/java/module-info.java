module com.example.java_8_plus {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_8_plus to javafx.fxml;
    exports com.example.java_8_plus;
}