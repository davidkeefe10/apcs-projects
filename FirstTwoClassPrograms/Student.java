/**
 * A student who is taking quizzes.
 */
public class Student
{
    private String name;
    private int numberOfQuizzes;
    private double totalScore;

    /**
     * Constructs a student with a given name.
     * @param n the name
     */
    public Student(String n)
    {
        name = n;
    }

    /**
     * Gets the name of this student.
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Adds a quiz score.
     * @param score the score to add
     */
    public void addQuiz(int score)
    {
        numberOfQuizzes = numberOfQuizzes + 1;
        totalScore = totalScore + score;
    }

    /**
     * Gets the sum of all quiz scores.
     * @return the total score
     */
    public double getTotalScore()
    {
        return totalScore;
    }

    /**
     * Gets the average of all quiz scores.
     * @return the average score
     */
    public double getAverageScore()
    {
        return totalScore/numberOfQuizzes;
    }

    public String toString()
    {
        return "This student's name is " + name + ". " + name + "'s total quiz score is " + totalScore + " and their average quiz score is " + totalScore/numberOfQuizzes + ".";
    }
}
