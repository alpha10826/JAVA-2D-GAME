package main;

import inputs.keyboardinputs;
import inputs.mouseinputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {
    private mouseinputs mouseinputs;
    private int xDelta = 100, yDelta =100;
    public GamePanel() {

         mouseinputs= new mouseinputs(this);
         addKeyListener(new keyboardinputs(this));
         addMouseListener(mouseinputs);
         addMouseMotionListener(mouseinputs);
         }
    public void changexDelta(int value){
        this.xDelta += value;
        repaint();
    }
    public void changeyDelta(int value){
        this.yDelta += value;
        repaint();
    }

    public void setRecPos(int x ,int y){
        this.xDelta=x;
        this.yDelta=y;
        repaint();

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.fillRect( xDelta, yDelta,200,50);
       
        
    }
}
