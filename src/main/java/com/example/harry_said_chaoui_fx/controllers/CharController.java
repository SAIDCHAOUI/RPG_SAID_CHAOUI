package com.example.harry_said_chaoui_fx.controllers;

import com.example.Game;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CharController {

    @FXML
    private TextField nameField;

    @FXML
    protected void submitName(ActionEvent actionEvent) throws IOException {
        Game game = new Game();
        game.startGame();

        String name = nameField.getText();
        System.out.println(name);



    }
}
