/**
 * This class converts letter grades into number grades.
 */

public class Grade
{
    private String letterGrade;
    private double numericGrade;

    /**
     * Constructs a grade object.
     * @param g the letter grade
     */
    public Grade(String g)
    {
        letterGrade = g;
    }

    /**
     * Determines the numeric grade that corresponds to the inputted letter grade.
     * @return the numeric grade
     */
    public double getNumericGrade()
    {
        if (letterGrade.equals("A+") || letterGrade.equals("A"))
            numericGrade = 4.0;
        else if (letterGrade.equals("A-"))
            numericGrade = 3.7;
        else if (letterGrade.equals("B+"))
            numericGrade = 3.3;
        else if (letterGrade.equals("B"))
            numericGrade = 3.0;
        else if (letterGrade.equals("B-"))
            numericGrade = 2.7;
        else if (letterGrade.equals("C+"))
            numericGrade = 2.3;
        else if (letterGrade.equals("C"))
            numericGrade = 2.0;
        else if (letterGrade.equals("C-"))
            numericGrade = 1.7;
        else if (letterGrade.equals("D+"))
            numericGrade = 1.3;
        else if (letterGrade.equals("D"))
            numericGrade = 1.0;
        else if (letterGrade.equals("D-"))
            numericGrade = 0.7;
        else if (letterGrade.equals("F"))
            numericGrade = 0.0;

        return numericGrade;
    }
}
