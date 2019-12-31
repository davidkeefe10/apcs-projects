/**
 This class tests the Purse class.
 */
public class Purse2Tester
{
    public static void main(String[] args)
    {
        Purse2 p = new Purse2();
        p.addCoin("Quarter");
        p.addCoin("Dime");
        p.addCoin("Nickel");
        p.addCoin("Dime");
        System.out.println("Original purse: " + p.toString());
        System.out.println("Expected: Purse[Quarter,Dime,Nickel,Dime]");
        p.reverse();
        System.out.println("Reversed purse: " + p.toString());
        System.out.println("Expected: Purse[Dime,Nickel,Dime,Quarter]");
    }
}