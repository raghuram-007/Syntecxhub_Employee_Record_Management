import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        while (true) {
            System.out.println("\n===== Employee Record Management =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. View Employees");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    manager.addEmployee(new Employee(id, name, dept, salary));
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String uname = sc.nextLine();

                    System.out.print("Enter New Department: ");
                    String udept = sc.nextLine();

                    System.out.print("Enter New Salary: ");
                    double usal = sc.nextDouble();

                    manager.updateEmployee(uid, uname, udept, usal);
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    manager.deleteEmployee(sc.nextInt());
                    break;

                case 4:
                    manager.viewEmployees();
                    break;

                case 5:
                    System.out.println(" Exiting Program");
                    System.exit(0);

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}
