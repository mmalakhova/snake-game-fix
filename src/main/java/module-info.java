module ru.nsu {
    requires javafx.controls;
    requires javafx.fxml;

    exports ru.nsu;
    opens ru.nsu to javafx.fxml;
    exports ru.nsu.snakegame.sprite;
    opens ru.nsu.snakegame.sprite to javafx.fxml;
    exports ru.nsu.snakegame.sprite.board;
    opens ru.nsu.snakegame.sprite.board to javafx.fxml;
    exports ru.nsu.snakegame.sprite.snake;
    opens ru.nsu.snakegame.sprite.snake to javafx.fxml;
    exports ru.nsu.snakegame.sprite.fruit;
    opens ru.nsu.snakegame.sprite.fruit to javafx.fxml;
    exports ru.nsu.snakegame.game;
    opens ru.nsu.snakegame.game to javafx.fxml;
    exports ru.nsu.snakegame.cell;
    opens ru.nsu.snakegame.cell to javafx.fxml;
    exports ru.nsu.snakegamefx.skin;
    opens ru.nsu.snakegamefx.skin to javafx.fxml;
    exports ru.nsu.snakegamefx.sprite;
    opens ru.nsu.snakegamefx.sprite to javafx.fxml;
    exports ru.nsu.snakegamefx.game;
    opens ru.nsu.snakegamefx.game to javafx.fxml;
    exports ru.nsu.application.configuration;
    opens ru.nsu.application.configuration to javafx.fxml;
    exports ru.nsu.application.snakegame;
    opens ru.nsu.application.snakegame to javafx.fxml;
}