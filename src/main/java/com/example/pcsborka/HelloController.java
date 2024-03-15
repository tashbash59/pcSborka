package com.example.pcsborka;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button corpus;

    @FXML
    private void openFindProducts(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("find_product.fxml"));
        Parent root = fxmlLoader.load();

        Stage secondStage = new Stage();
        secondStage.setTitle("Второе окно");
        secondStage.setScene(new Scene(root));
        secondStage.show();
    }
}