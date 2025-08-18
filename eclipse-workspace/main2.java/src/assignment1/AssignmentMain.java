import com.santhiya.assignment.employees.Manager;
import com.santhiya.assignment.employees.Developer;
import com.santhiya.assignment.utilities.EmployeeUtilities;

/**
 * Main class to demonstrate usage of packages and modifiers.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Creating Manager and Developer objects
        Manager mgr = new Manager("Alice", 101, 75000, "HR");
        Developer dev = new Developer("Bob", 202, 60000, "Java");

        // Printing employee details
        EmployeeUtilities.printEmployeeDetails(mgr);
        EmployeeUtilities.printEmployeeDetails(dev);

        // Increasing salary
        EmployeeUtilities.increaseSalary(dev, 5000);
        System.out.println("After Salary Increase:");
        EmployeeUtilities.printEmployeeDetails(dev);
    }
}
