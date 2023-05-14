package com.example;

import com.example.harry_said_chaoui_fx.controllers.GameController;
import com.example.model.character.Wizard;
import com.example.model.levels.*;
import com.example.model.misc.SortingHat;
import com.example.utils.UserInput;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application {

    private static final UserInput input = UserInput.getInstance();
    private Wizard wizard;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("game-view.fxml"));
        Parent root = loader.load();

        GameController gameController = loader.getController();
        gameController.setGame(this);

        primaryStage.setTitle("Harry Potter RPG");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void startGame() {
        // The code to start the game
        System.out.println("To start the game, please tell us your name:");
        String name = input.readString();
        wizard = new Wizard(name, 100, 10);
        SortingHat.assignWand(wizard);

        System.out.println("Welcome again " + wizard.getName() + " !");
        // Afficher les informations du Wizard
        System.out.printf("The sorting Hat assigned you to %s.\n", wizard.getHouse().getName());
        System.out.printf("Your magic wand is in %s with %d cm.\n", wizard.getWand().getCore().getName(), wizard.getWand().getSize());
        System.out.printf("To start, you have %d HP.\n", wizard.getHp());

        // Commencement du jeu
        System.out.println("---------------------------------");
        Level_1_PhilosopherStone level_1_PhilosopherStone = new Level_1_PhilosopherStone(wizard);
        level_1_PhilosopherStone.fight(wizard);

        Level_2_ChamberOfSecrets level_2_chamberOfSecrets = new Level_2_ChamberOfSecrets(wizard);
        level_2_chamberOfSecrets.fight(wizard);

        Level_3_PrisonnerOfAskaban level_3_prisonnerOfAskaban = new Level_3_PrisonnerOfAskaban(wizard);
        level_3_prisonnerOfAskaban.fight(wizard);

        Level_4_GobletOfFire level_4_gobletOfFire = new Level_4_GobletOfFire(wizard);
        level_4_gobletOfFire.fight(wizard);

        Level_5_OrderOfThePhoenix level_5_orderOfThePhoenix = new Level_5_OrderOfThePhoenix(wizard);
        level_5_orderOfThePhoenix.fight(wizard);

        Level_6_HalfBloodPrince level_6_halfBloodPrince = new Level_6_HalfBloodPrince(wizard);
        level_6_halfBloodPrince.fight(wizard);

        Level_7_DeathlyHallows level_7_deathlyHallows = new Level_7_DeathlyHallows(wizard);
        level_7_deathlyHallows.fight(wizard);

        System.out.println("Congratulations! You are now a true wizard !");
    }

    public void startLevel() {
        // Code pour commencer un niveau
    }

    public static void main(String[] args) {
        launch(args);
    }


}