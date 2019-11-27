public class StudentTester
{
    public static void main(String[] args)
    {
        Student student = new Student("Cracker, Carla");
        student.addQuiz(70);
        student.addQuiz(93);
        student.addQuiz(81);

        System.out.println("This student's name is " + student.getName() + ". " + student.getName() + "'s total quiz score is " + student.getTotalScore() + " and their average quiz score is " + student.getAverageScore() + ".");
        System.out.println(student.toString());  //Alternate way to print data
    }
}
