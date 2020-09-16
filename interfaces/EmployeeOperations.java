package interfaces;
import classes.Employee;
import java.lang.*;

public interface EmployeeOperations
{
    boolean insertEmployee(Employee e);
    boolean removeEmployee(Employee e);
    Employee searchEmployee(String empId);
    void showAllEmployees();
}