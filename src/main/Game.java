package main;

public class Game {

    private GameWindow gamewindow ;
    private GamePanel gamePanel;
    public Game()
    {
        gamePanel  = new GamePanel();
        gamewindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();

    }
}
