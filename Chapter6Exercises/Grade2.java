/**
 * This class converts number grades to letter grades.
 */

public class Grade2
{
    private double numericGrade;
    private String letterGrade;

    /**
     * Creates a grade object.
     * @param g the numeric grade
     */
    public Grade2(double g)
    {
        numericGrade = g;
    }

    /**
     * Converts a numeric grade to its corresponding letter grade
     * @return the letter grade
     */
    public String getLetterGrade()
    {
        if (numericGrade >= 3.85)
            letterGrade = "A";
        else if (numericGrade < 3.85 && numericGrade >= 3.5)
            letterGrade = "A-";
        else if (numericGrade < 3.5 && numericGrade >= 3.15)
            letterGrade = "B+";
        else if (numericGrade < 3.15 && numericGrade >= 2.85)
            letterGrade = "B";
        else if (numericGrade < 2.85 && numericGrade >= 2.5)
            letterGrade = "B-";
        else if (numericGrade < 2.5 && numericGrade >= 2.15)
            letterGrade = "C+";
        else if (numericGrade < 2.15 && numericGrade >= 1.85)
            letterGrade = "C";
        else if (numericGrade < 1.85 && numericGrade >= 1.5 )
            letterGrade = "C-";
        else if (numericGrade < 1.5 && numericGrade >= 1.15)
            letterGrade = "D+";
        else if (numericGrade < 1.15 && numericGrade >= 0.85)
            letterGrade = "D";
        else if (numericGrade < 0.85 && numericGrade >= 0.35)
            letterGrade = "D-";
        else if (numericGrade < 0.35)
            letterGrade = "F";

        return letterGrade;
    }
}
