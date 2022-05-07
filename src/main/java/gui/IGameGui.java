package gui;

import game.GameScreen;

public interface IGameGui {
    /**
     *
     * @return The number of rows.
     */
    int numRows();

    /**
     *
     * @return The number of cols.
     */
    int numCols();

    /**
     *
     * @return The current score.
     */
    int getScore();

    /**
     *
     * @return The current level you are on.
     */
    int getLevel();

    /**
     *
     * @return The current game screen.
     */
    GameScreen getGameScreen();

    /**
     * Sets current gameScreen.
     */
    void setGameScreen(GameScreen gameScreen);
}
