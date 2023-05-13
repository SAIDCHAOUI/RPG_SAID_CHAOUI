package com.example.harry_said_chaoui_fx.controllers;

import com.example.Game;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CharController {

    @FXML
    private TextField nameField;

    @FXML
    protected void submitName(ActionEvent actionEvent) {
        String name = nameField.getText();
        System.out.println("The user entered: " + name);

        // Vous pouvez maintenant utiliser la variable 'name' pour initialiser votre jeu
        Game game = new Game();
        game.startGame();

        // Chargement de la nouvelle scène
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("register.fxml"));
            Parent pane = fxmlLoader.load();
            Scene scene = new Scene(pane);
            Stage stage = (Stage) nameField.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
