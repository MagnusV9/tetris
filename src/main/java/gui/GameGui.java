package gui;

import game.GameScreen;
import grid.Grid;

public class GameGui<T> implements IGameGui {
    /**
     * Grid to play on.
     */
    private Grid<T> grid;

    /**
     * Current score.
     */
    private int score;

    /**
     * Current level.
     */
    private int level;

    private GameScreen gameScreen;


    public GameGui(Grid<T> grid) {
        this.grid = grid;
        this.score = 0;
        this.level = 1;
        this.gameScreen = GameScreen.MAIN_MENU;
    }

    @Override
    public int numRows() {
        return grid.numRows();
    }

    @Override
    public int numCols() {
        return grid.numCols();
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public GameScreen getGameScreen() {
        return this.gameScreen;
    }

    @Override
    public void setGameScreen(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
    }
}
