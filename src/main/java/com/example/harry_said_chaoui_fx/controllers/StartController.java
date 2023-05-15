package com.example.harry_said_chaoui_fx.controllers;

import com.example.Game;
import com.example.harry_said_chaoui_fx.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class StartController {

    @FXML
    protected void onStartGameButtonClick(ActionEvent actionEvent) throws IOException {


        // Chargement de la nouvelle scène
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("char-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        ((Stage) ((Button) actionEvent.getSource()).getScene().getWindow()).setScene(scene);

    }
}
