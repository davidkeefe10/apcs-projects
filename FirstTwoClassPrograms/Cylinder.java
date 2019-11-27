public class Cylinder
{
    private int height;
    private int radius;

    public Cylinder(int r, int h)
    {
        radius = r;
        height = h;
    }

    public double getVolume()
    {
        return Math.PI*radius*radius*height;
    }
}
