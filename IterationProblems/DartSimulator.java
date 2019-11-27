/**
 * This class uses a dart simulator to estimate the value of pi.
 */
public class DartSimulator
{
    public static void main(String[] args)
    {
        Dart myDart = new Dart();
        double epsilon = 1E-10;
        double areaOfSquare = 4.0;
        myDart.throwIntoSquare();

        do
        {
            myDart.throwIntoSquare();
        }
        while (Math.abs(myDart.getHits()*areaOfSquare/myDart.getTries() - Math.PI) > epsilon);

        System.out.println(myDart.getHits()*areaOfSquare/myDart.getTries());
    }
}
