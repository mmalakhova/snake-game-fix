package ru.nsu.snakegame.game;

/**
 * This class represents all possible states of the game.
 */
public enum GameState {
    DEFEAT("START NEW GAME"),
    VICTORY("YOU WIN"),
    PLAY("SNAKE GAME");

    private final String state;

    GameState(String state) {
        this.state = state;
    }

    /**
     * Returns game state as string.
     *
     * @return game state as string.
     */
    @Override
    public String toString() {
        return state;
    }
}
