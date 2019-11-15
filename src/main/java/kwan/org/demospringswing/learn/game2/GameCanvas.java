package kwan.org.demospringswing.learn.game2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class GameCanvas extends JPanel {

    BufferedImage starImage , enemyImage , playerImage;

    BufferedImage backBuffered;
    Graphics graphics;

    //BackBuffered

    public int positionXStar = 400;
    public int positionYStar = 200;
    public int positionXPlayer = 512;
    public int positionYPlayer = 300;


    public GameCanvas() {
        this.setSize(1024 , 600);

        this.backBuffered = new BufferedImage(1024,600,BufferedImage.TYPE_4BYTE_ABGR);
        this.graphics = backBuffered.getGraphics();

        try {
            this.starImage = ImageIO.read(new File("images/star.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            this.enemyImage = ImageIO.read(new File("images/circle.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            this.playerImage = ImageIO.read(new File("images/circle.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(this.backBuffered,0,0,null);
        renderAll();
    }

    public void renderAll() {
        this.graphics.setColor(Color.BLACK);
        this.graphics.fillRect(0, 0, 1024, 600);

        this.graphics.drawImage(this.starImage, this.positionXStar, this.positionYStar, 5, 5, null);

        this.graphics.drawImage(this.enemyImage, 100, 200, 20, 20, null);

        this.graphics.drawImage(this.playerImage, positionXPlayer, positionYPlayer, 20, 20, null);

        this.repaint();
    }
}
