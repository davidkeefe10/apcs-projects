/**
 This program calculates an alternating sum.
*/
public class AlternatingSumTester
{
    public static void main(String[] args)
    {
        AlternatingSum data = new AlternatingSum();
        data.add(1);
        data.add(4);
        data.add(9);
        data.add(16);
        data.add(9);
        data.add(7);
        data.add(4);
        data.add(9);
        data.add(11);
        double sum = data.getAlternatingSum();
        System.out.println("Alternating Sum = " + sum);
        System.out.println("Expected: -2.0");
    }
}
