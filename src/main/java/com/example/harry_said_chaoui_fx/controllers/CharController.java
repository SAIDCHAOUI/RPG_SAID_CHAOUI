package com.example.harry_said_chaoui_fx.controllers;

import com.example.Game;
import com.example.harry_said_chaoui_fx.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CharController {

    @FXML
    private TextField nameField;

    @FXML
    protected void submitName(ActionEvent actionEvent) throws IOException {
        String name = nameField.getText();
        System.out.println(name);


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        ((Stage) ((Button) actionEvent.getSource()).getScene().getWindow()).setScene(scene);
    }
}
