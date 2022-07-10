package src.gameObjects;

import src.Collidable;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PowerUp extends src.gameObjects.GameObject implements Collidable {

    public PowerUp(int x, int y, BufferedImage img) {
        super(x, y, img);
    }

    @Override
    public void update() {

    }

    @Override
    public void collision(Collidable obj) {
        if (obj instanceof src.gameObjects.Tank && ((src.gameObjects.Tank) obj).getLives() < 4) {
            this.alive = false;
        }
    }

    @Override
    public void drawImage(Graphics2D g2d) {
        if (this.alive) {
            g2d.drawImage(this.img, x, y, null);
        }
    }
}
