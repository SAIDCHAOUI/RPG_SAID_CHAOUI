package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private TextArea textArea;

    @FXML
    protected void onHelloButtonClick() {
        textArea.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onStartGameButtonClick(ActionEvent actionEvent) {
        Game game = new Game();
        game.startGame();
        textArea.setText("Game started!");
    }
}
