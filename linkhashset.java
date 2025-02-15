import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Objects;

class Employee {
    private int id;
    private double salary;
    private String name;

    public Employee(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    // Overriding hashCode() and equals() to ensure proper uniqueness in HashSet
    @Override
    public int hashCode() {
        return Objects.hash(id); // Using id as a unique identifier
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id; 
    }
}

public class linkhashset {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, 9090, "Rashmika");
        Employee e2 = new Employee(2, 6290, "Cheetah");
        Employee e3 = new Employee(3, 912090, "Sherrr");
        // Employee e4 = new Employee(3, 912090, "Sherrr"); 

        Set<Employee> s  = new LinkedHashSet<Employee>();
        s.add(e3);
        s.add(e2);
        s.add(e1);
        // s.add(e4); // This will be ignored because e3 and e4 have the same ID

        System.out.println(s);
        System.out.println(s instanceof HashSet);
    }
}
