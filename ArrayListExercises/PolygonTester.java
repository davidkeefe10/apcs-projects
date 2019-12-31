public class PolygonTester
{
    public static void main(String[] args)
    {
        Polygon test = new Polygon();
        test.add(0,0);
        test.add(4,0);
        test.add(4,6);
        test.add(0,6);

        System.out.println("Perimeter: " + test.getPerimeter());
        System.out.println("Expected: 20.0");
        System.out.println("Area: " + test.getArea());
        System.out.println("Expected: 24.0");
    }
}
