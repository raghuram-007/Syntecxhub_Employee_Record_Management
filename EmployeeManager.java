import java.util.*;

public class EmployeeManager {

    private HashMap<Integer, Employee> employeeMap = new HashMap<>();
    private ArrayList<Employee> employeeList = new ArrayList<>();
    private HashSet<Integer> idSet = new HashSet<>();

    // Add Employee
    public void addEmployee(Employee emp) {
        if (idSet.contains(emp.getId())) {
            System.out.println(" Employee ID already exists!");
            return;
        }
        employeeMap.put(emp.getId(), emp);
        employeeList.add(emp);
        idSet.add(emp.getId());
        System.out.println(" Employee added successfully!");
    }

    // Update Employee
    public void updateEmployee(int id, String name, String dept, double salary) {
        Employee emp = employeeMap.get(id);
        if (emp == null) {
            System.out.println(" Employee not found!");
            return;
        }
        emp.setName(name);
        emp.setDepartment(dept);
        emp.setSalary(salary);
        System.out.println(" Employee updated successfully!");
    }

    // Delete Employee
    public void deleteEmployee(int id) {
        Employee emp = employeeMap.remove(id);
        if (emp == null) {
            System.out.println(" Employee not found!");
            return;
        }
        employeeList.remove(emp);
        idSet.remove(id);
        System.out.println(" Employee deleted successfully!");
    }

    // View Employees
    public void viewEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println(" No employee records found.");
            return;
        }
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
