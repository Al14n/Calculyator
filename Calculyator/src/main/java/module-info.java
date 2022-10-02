module com.example.calculyator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculyator to javafx.fxml;
    exports com.example.calculyator;
}