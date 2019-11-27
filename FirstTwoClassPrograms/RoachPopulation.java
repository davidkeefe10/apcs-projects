public class RoachPopulation
{
    private double numRoaches;

    public RoachPopulation(double n)
    {
        numRoaches = n;
    }

    public double getRoaches()
    {
        return numRoaches;
    }

    public void breed()
    {
        numRoaches = numRoaches * 2;
    }

    public void spray()
    {
        numRoaches = numRoaches * 0.9;
    }
}
