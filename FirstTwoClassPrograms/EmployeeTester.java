public class EmployeeTester
{
    public static void main(String[] args)
    {
        Employee harry = new Employee("Harry Hacker", 50000);
        harry.raiseSalary(10);
        System.out.println("This employee's name is " + harry.getName() + ".");
        System.out.println("Their salary is " + harry.getSalary() + ".");

        System.out.println(harry.toString()); //Alternate way to print data
    }
}
