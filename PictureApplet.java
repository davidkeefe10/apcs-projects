/**
 * Created by 20KeefeD on 10/28/2019.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.net.URL;
import javax.imageio.*;
import java.text.DecimalFormat;

public class PictureApplet extends JApplet {
    //instance fields
    private double score = 0.0;
    private int correct = 0;
    DecimalFormat oneDigit = new DecimalFormat("#.0");
    BufferedImage img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11;

    /**
     * SET images for program
     */
    public void init() {
        this.setSize(500, 500);
        try {
            System.out.print(getDocumentBase());
            img1 = ImageIO.read(this.getClass().getResource("img1.jpg"));
            img2 = ImageIO.read(this.getClass().getResource("img2.jpg"));
            img3 = ImageIO.read(this.getClass().getResource("img3.jpg"));
            img4 = ImageIO.read(this.getClass().getResource("img4.jpg"));
            img5 = ImageIO.read(this.getClass().getResource("img5.jpg"));
            img6 = ImageIO.read(this.getClass().getResource("img6.jpg"));
            img7 = ImageIO.read(this.getClass().getResource("img7.jpg"));
            img8 = ImageIO.read(this.getClass().getResource("img8.jpg"));
            img9 = ImageIO.read(this.getClass().getResource("img9.jpg"));
            img10 = ImageIO.read(this.getClass().getResource("img10.jpg"));
            img11 = ImageIO.read(this.getClass().getResource("img11.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * Provides the 50 state capitals, which the user will pick from in the applet.
         */
        String choice[] = {"Albany", "Annapolis", "Atlanta", "Augusta", "Austin", "Baton Rouge", "Bismarck",
                            "Boise", "Boston", "Carson City", "Charleston", "Cheyenne", "Columbia", "Columbus",
                            "Concord", "Denver", "Des Moines", "Dover", "Frankfort", "Harrisburg", "Hartford",
                            "Helena", "Honolulu", "Indianapolis", "Jackson", "Jefferson City", "Juneau", "Lansing",
                            "Lincoln", "Little Rock", "Madison", "Montgomery", "Montpelier", "Nashville", "Oklahoma City",
                            "Olympia", "Phoenix", "Pierre", "Providence", "Raleigh", "Richmond", "Sacramento", "Salem",
                            "Salt Lake City", "Santa Fe", "Springfield", "St. Paul", "Tallahassee", "Topeka", "Trenton"};
        JFrame frame = new JFrame("Emoji Dialog");

        /**
         * Provides the questions and correct answers.
         */
        String question1 = (String) JOptionPane.showInputDialog(frame,
                "What is the capital of Massachusetts",
                "Your Choice (Phoenix, Sacramento, Denver, Hartford, Atlanta, Indianapolis, Boston, Albany, Oklahoma City, Providence, Albany, Annapolis, Atlanta, Augusta, Austin, Baton Rouge, Bismarck, Boise, Boston, Carson City, Charleston, Cheyenne, Columbia, Columbus, Concord, Denver, Des Moines, Dover, Frankfort, Harrisburg, Hartford, Helena, Honolulu, Indianapolis, Jackson, Jefferson City, Juneau, Lansing, Lincoln, Little Rock, Madison, Montgomery, Montpelier, Nashville, Oklahoma City, Olympia, Phoenix, Pierre, Providence, Raleigh, Richmond, Sacramento, Salem, Salt Lake City, Santa Fe, Springfield, St. Paul, Tallahassee, Topeka, Trenton)",
                JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
        if (question1.equals"Boston") {
            score++;
            correct++;
        }

        String question2 = (String) JOptionPane.showInputDialog(frame,
                "What is the capital of California?",
                "Your Choice (Albany, Annapolis, Atlanta, Augusta, Austin, Baton Rouge, Bismarck, Boise, Boston, Carson City, Charleston, Cheyenne, Columbia, Columbus, Concord, Denver, Des Moines, Dover, Frankfort, Harrisburg, Hartford, Helena, Honolulu, Indianapolis, Jackson, Jefferson City, Juneau, Lansing, Lincoln, Little Rock, Madison, Montgomery, Montpelier, Nashville, Oklahoma City, Olympia, Phoenix, Pierre, Providence, Raleigh, Richmond, Sacramento, Salem, Salt Lake City, Santa Fe, Springfield, St. Paul, Tallahassee, Topeka, Trenton)",
                JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
        if (question2.equals"Sacramento") {
            score++;
            correct++;
        }

        String question3 = (String) JOptionPane.showInputDialog(frame,
                "What is the capital of Alaska?",
                "Your Choice (Albany, Annapolis, Atlanta, Augusta, Austin, Baton Rouge, Bismarck, Boise, Boston, Carson City, Charleston, Cheyenne, Columbia, Columbus, Concord, Denver, Des Moines, Dover, Frankfort, Harrisburg, Hartford, Helena, Honolulu, Indianapolis, Jackson, Jefferson City, Juneau, Lansing, Lincoln, Little Rock, Madison, Montgomery, Montpelier, Nashville, Oklahoma City, Olympia, Phoenix, Pierre, Providence, Raleigh, Richmond, Sacramento, Salem, Salt Lake City, Santa Fe, Springfield, St. Paul, Tallahassee, Topeka, Trenton)",
                JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
        if (question3.equals"Juneau") {
            score = score + 2;
            correct++;
        }

        String question4 = (String) JOptionPane.showInputDialog(frame,
                "What is the capital of Delaware?",
                "Your Choice (Albany, Annapolis, Atlanta, Augusta, Austin, Baton Rouge, Bismarck, Boise, Boston, Carson City, Charleston, Cheyenne, Columbia, Columbus, Concord, Denver, Des Moines, Dover, Frankfort, Harrisburg, Hartford, Helena, Honolulu, Indianapolis, Jackson, Jefferson City, Juneau, Lansing, Lincoln, Little Rock, Madison, Montgomery, Montpelier, Nashville, Oklahoma City, Olympia, Phoenix, Pierre, Providence, Raleigh, Richmond, Sacramento, Salem, Salt Lake City, Santa Fe, Springfield, St. Paul, Tallahassee, Topeka, Trenton)",
                JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
        if (question4.equals"Dover")
        {
            score = score + 2;
            correct++;
        }

        String question5 = (String) JOptionPane.showInputDialog(frame,
                "What is the capital of Ohio?",
                "Your Choice (Albany, Annapolis, Atlanta, Augusta, Austin, Baton Rouge, Bismarck, Boise, Boston, Carson City, Charleston, Cheyenne, Columbia, Columbus, Concord, Denver, Des Moines, Dover, Frankfort, Harrisburg, Hartford, Helena, Honolulu, Indianapolis, Jackson, Jefferson City, Juneau, Lansing, Lincoln, Little Rock, Madison, Montgomery, Montpelier, Nashville, Oklahoma City, Olympia, Phoenix, Pierre, Providence, Raleigh, Richmond, Sacramento, Salem, Salt Lake City, Santa Fe, Springfield, St. Paul, Tallahassee, Topeka, Trenton)",
                JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
        if(question5.equals"Columbus")
        {
            score = score + 3;
            correct++;
        }

        String question6 = (String) JOptionPane.showInputDialog(frame,
                "What is the capital of Michigan?",
                "Your Choice (Albany, Annapolis, Atlanta, Augusta, Austin, Baton Rouge, Bismarck, Boise, Boston, Carson City, Charleston, Cheyenne, Columbia, Columbus, Concord, Denver, Des Moines, Dover, Frankfort, Harrisburg, Hartford, Helena, Honolulu, Indianapolis, Jackson, Jefferson City, Juneau, Lansing, Lincoln, Little Rock, Madison, Montgomery, Montpelier, Nashville, Oklahoma City, Olympia, Phoenix, Pierre, Providence, Raleigh, Richmond, Sacramento, Salem, Salt Lake City, Santa Fe, Springfield, St. Paul, Tallahassee, Topeka, Trenton)",
                JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
        if(question6.equals"Lansing")
        {
            score = score + 3;
            correct++;
        }

        String question7 = (String) JOptionPane.showInputDialog(frame,
                "What is the capital of Mississippi?",
                "Your Choice (Albany, Annapolis, Atlanta, Augusta, Austin, Baton Rouge, Bismarck, Boise, Boston, Carson City, Charleston, Cheyenne, Columbia, Columbus, Concord, Denver, Des Moines, Dover, Frankfort, Harrisburg, Hartford, Helena, Honolulu, Indianapolis, Jackson, Jefferson City, Juneau, Lansing, Lincoln, Little Rock, Madison, Montgomery, Montpelier, Nashville, Oklahoma City, Olympia, Phoenix, Pierre, Providence, Raleigh, Richmond, Sacramento, Salem, Salt Lake City, Santa Fe, Springfield, St. Paul, Tallahassee, Topeka, Trenton)",
                JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
        if(question7.equals"Jackson")
        {
            score = score + 4;
            correct++;
        }

        String question8 = (String) JOptionPane.showInputDialog(frame,
                "What is the capital of Wisconsin?",
                "Your Choice (Albany, Annapolis, Atlanta, Augusta, Austin, Baton Rouge, Bismarck, Boise, Boston, Carson City, Charleston, Cheyenne, Columbia, Columbus, Concord, Denver, Des Moines, Dover, Frankfort, Harrisburg, Hartford, Helena, Honolulu, Indianapolis, Jackson, Jefferson City, Juneau, Lansing, Lincoln, Little Rock, Madison, Montgomery, Montpelier, Nashville, Oklahoma City, Olympia, Phoenix, Pierre, Providence, Raleigh, Richmond, Sacramento, Salem, Salt Lake City, Santa Fe, Springfield, St. Paul, Tallahassee, Topeka, Trenton)",
                JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
        if(question8.equals"Madison")
        {
            score = score + 4;
            correct++;
        }

        String question9 = (String) JOptionPane.showInputDialog(frame,
                "What is the capital of Nevada?",
                "Your Choice (Albany, Annapolis, Atlanta, Augusta, Austin, Baton Rouge, Bismarck, Boise, Boston, Carson City, Charleston, Cheyenne, Columbia, Columbus, Concord, Denver, Des Moines, Dover, Frankfort, Harrisburg, Hartford, Helena, Honolulu, Indianapolis, Jackson, Jefferson City, Juneau, Lansing, Lincoln, Little Rock, Madison, Montgomery, Montpelier, Nashville, Oklahoma City, Olympia, Phoenix, Pierre, Providence, Raleigh, Richmond, Sacramento, Salem, Salt Lake City, Santa Fe, Springfield, St. Paul, Tallahassee, Topeka, Trenton)",
                JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
        if(question9.equals"Carson City")
        {
            score = score + 5;
            correct++;
        }

        String question10 = (String) JOptionPane.showInputDialog(frame,
                "What is the capital of South Dakota?",
                "Your Choice (Albany, Annapolis, Atlanta, Augusta, Austin, Baton Rouge, Bismarck, Boise, Boston, Carson City, Charleston, Cheyenne, Columbia, Columbus, Concord, Denver, Des Moines, Dover, Frankfort, Harrisburg, Hartford, Helena, Honolulu, Indianapolis, Jackson, Jefferson City, Juneau, Lansing, Lincoln, Little Rock, Madison, Montgomery, Montpelier, Nashville, Oklahoma City, Olympia, Phoenix, Pierre, Providence, Raleigh, Richmond, Sacramento, Salem, Salt Lake City, Santa Fe, Springfield, St. Paul, Tallahassee, Topeka, Trenton)",
                JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
        if(question10.equals"Pierre")
        {
            score = score + 5;
            correct++;
        }

        score = score / 3.0;
        repaint();
    }
    /**
     *
     * @param g Graphic object, and decide what image to load conditionally based on
    "selection".
     * You can add as many pics as you want to.
     */
    public void paint (Graphics g)
    {
        super.paint(g);

         /**
          *Determines what emoji to display, based on the users score,
          * and displays the number of questions they got correct and their aggregate score.
         */
        if (score >= 0.0 && score < 1.0)
        {
            g.drawImage(img1, 50, 50, null);
            g.drawString("You got " + correct + "/10 questions correct, with an aggregate score of " + oneDigit.format(score) + " points!", 25, 25);
        }
        else if (score >= 1.0 && score < 2.0)
        {
            g.drawImage(img2, 50, 50, null);
            g.drawString("You got " + correct + "/10 questions correct, with an aggregate score of " + oneDigit.format(score) + " points!", 25, 25);
        }
        else if (score >= 2.0 && score < 3.0)
        {
            g.drawImage(img3, 50, 50, null);
            g.drawString("You got " + correct + "/10 questions correct, with an aggregate score of " + oneDigit.format(score) + " points!", 25, 25);
        }
        else if (score >= 3.0 && score < 4.0)
        {
            g.drawImage(img4, 50, 50, null);
            g.drawString("You got " + correct + "/10 questions correct, with an aggregate score of " + oneDigit.format(score) + " points!", 25, 25);
        }
        else if (score >= 4.0 && score < 5.0)
        {
            g.drawImage(img5, 50, 50, null);
            g.drawString("You got " + correct + "/10 questions correct, with an aggregate score of " + oneDigit.format(score) + " points!", 25, 25);
        }
        else if (score >= 5.0 && score < 6.0)
        {
            g.drawImage(img6, 50, 50, null);
            g.drawString("You got " + correct + "/10 questions correct, with an aggregate score of " + oneDigit.format(score) + " points!", 25, 25);
        }
        else if (score >= 6.0 && score < 7.0)
        {
            g.drawImage(img7, 50, 50, null);
            g.drawString("You got " + correct + "/10 questions correct, with an aggregate score of " + oneDigit.format(score) + " points!", 25, 25);
        }
        else if (score >= 7.0 && score < 8.0)
        {
            g.drawImage(img8, 50, 50, null);
            g.drawString("You got " + correct + "/10 questions correct, with an aggregate score of " + oneDigit.format(score) + " points!", 25, 25);
        }
        else if (score >= 8.0 && score < 9.0)
        {
            g.drawImage(img9, 50, 50, null);
            g.drawString("You got " + correct + "/10 questions correct, with an aggregate score of " + oneDigit.format(score) + " points!", 25, 25);
        }
        /**
         * Provides a fun Easter Egg if the user gets 29 out of 30 possible points.
         */
        else if (score >= 9.6 && score < 9.7)
        {
            g.drawImage(img11, 50, 50, null);
            g.drawString("You got " + correct + "/10 questions correct, with an aggregate score of " + oneDigit.format(score) + " points,", 25, 25);
            g.drawString("and you discovered the Easter Egg!!", 125, 40);
        }
        else if ((score >= 9.0 && score < 9.6) || (score >= 9.7 && score <= 10.0))
        {
            g.drawImage(img10, 50, 50, null);
            g.drawString("You got " + correct + "/10 questions correct, with an aggregate score of " + oneDigit.format(score) + " points!", 25, 25);
        }
    }
} //end of class

