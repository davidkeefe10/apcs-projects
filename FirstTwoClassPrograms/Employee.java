/**
 * An employee with a name and salary.
 */
public class Employee
{
    private String name;
    private double salary;

    /**
     * Constructs an employee.
     * @param employeeName the employee name
     * @param currentSalary the employee salary
     */
    public Employee(String employeeName, double currentSalary)
    {
        name = employeeName;
        salary = currentSalary;
    }

    /**
     * Gets the employee name.
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the employee salary.
     * @return the salary
     */
    public double getSalary()
    {
        return salary;
    }

    /**
     * Raise the salary by a given percentage.
     * @param percent the percentage of the raise
     */
    public void raiseSalary(double percent)
    {
        salary = salary*(1+percent/100);
    }

    /**
     * Creates a message that includes the employee's name and salary.
     * @return this message
     */
    public String toString()
    {
        return "This employee's name is " + name + ". Their salary is $" + salary + ".";
    }
}
