package com.example.harry_said_chaoui_fx.controllers;

import com.example.Game;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class StartController {

    @FXML
    protected void onStartGameButtonClick(ActionEvent actionEvent) {
        Game game = new Game();
        game.startGame();

        // Chargement de la nouvelle scène
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent pane = fxmlLoader.load();
            Scene scene = new Scene(pane);
            Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
