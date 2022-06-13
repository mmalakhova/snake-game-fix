package ru.nsu.application.snakegame;

import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.stage.Stage;
import ru.nsu.snakegame.game.Game;

/**
 * Snake game controller. Provides user interaction with the interface of the snake game.
 */
public class SnakeGameController {
    private Timeline timeline;
    private Game game;

    @FXML
    private Label score;

    /**
     * Initializes the data necessary for the controller to work.
     * @param timeline - the instance of the class responsible for changing the frames of the snake game.
     * @param game - the model of the snake game.
     */
    public void initialize(Timeline timeline, Game game) {
        this.game = game;
        this.timeline = timeline;
    }

    /**
     * Updates score number on the screen.
     */
    public void updateScore() {
        score.setText("Score: " + game.getScore());
    }

}
