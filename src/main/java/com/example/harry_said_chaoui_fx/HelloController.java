package com.example.harry_said_chaoui_fx;
import com.example.Game;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        //start the game Game.java
        Game game = new Game();
        game.startGame();
    }
}