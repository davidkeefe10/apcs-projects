// Chapter 2 Question 15 (b)

/**
 * This program displays a red bullseye on a white
 * background.
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bullseye extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int xLarge = getWidth() / 4;
        int yLarge = getHeight() / 4;
        int xMedium = getWidth()*7 / 20;
        int yMedium = getHeight()*7 / 20;
        int xSmall = getWidth()*9 / 20;
        int ySmall = getHeight()*9 / 20;
        g.setColor(Color.RED);
        g.fillOval(xLarge, yLarge, ((getWidth() / 2) - xLarge)*2, ((getHeight() / 2) - yLarge)*2);
        g.setColor(Color.WHITE);
        g.fillOval(xMedium, yMedium, ((getWidth() / 2) - xMedium)*2, ((getHeight() / 2) - yMedium)*2);
        g.setColor(Color.RED);
        g.fillOval(xSmall, ySmall, ((getWidth() / 2) - xSmall)*2, ((getHeight() / 2) - ySmall)*2);
    }

    public static void main(String[] args)
    {
        JFrame window = new JFrame("Bullseye");
        window.setBounds(300, 300, 200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Bullseye panel = new Bullseye();
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}
