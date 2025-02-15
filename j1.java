import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    String salary;

    Employee(int id, String name, String salary) {
        this.id = id;
        this.name = name;
        
        this.salary = salary;
    }

    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary='" + salary + "'}";
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        int numEmploye = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numEmploye; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            String salary = scanner.nextLine();

            employees.add(new Employee(id, name, salary));
        }

        System.out.println("Employees List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        scanner.close();
    }
}