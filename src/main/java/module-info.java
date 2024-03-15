module com.example.pcsborka {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pcsborka to javafx.fxml;
    exports com.example.pcsborka;
}