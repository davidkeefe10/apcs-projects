public class Circle
{
    private int radius;

    public Circle()
    {
        radius = 0;
    }

    public Circle(int r)
    {
        radius = r;
    }

    public int getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }
}
