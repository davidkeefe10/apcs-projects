import java.awt.Image;
import java.awt.Graphics;

public class Coin {
    private Image heads;
    private Image tails;
    private int side;

    public Coin(Image h, Image t) {
        heads = h;
        tails = t;
        side = 0;
    }

    /**
     * Flips this coin
     */
    public void flip() {
        if (side == 0) {
            side = 1;
        } else {
            side = 0;
        }
    }

    /**
     * Draws the appropriate side of the coin
     * centered at (x, y)
     */
    public void draw(Graphics g, int x, int y) {
        if (side == 0) {
            g.drawImage(heads, x, y, null);
        } else {
            g.drawImage(tails, x, y, null);
        }
    }
}
