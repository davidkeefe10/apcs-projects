public class RoachSimulation
{
    public static void main(String[] args)
    {
        RoachPopulation population = new RoachPopulation(10);

        for (int count = 0; count < 4; count++)
        {
            population.breed();
            population.spray();
            System.out.print(population.getRoaches());
            System.out.println(" roaches");
        }
    }
}
