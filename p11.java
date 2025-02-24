import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int Salary;
    public Employee(int id, String name, int Salary) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;
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
    public int getSalary() {
        return Salary;
    }
    public void setSalary(int salary) {
        Salary = salary;
    }
    public int compareTo(Employee o) {
        return o.Salary - this.Salary;
    }
}

class sortSalary implements Comparator <Employee>{

  
    public int compare(Employee o1, Employee o2) {
            if(o1.getSalary()<o2.getSalary()){
                 return +1;
            }
            else if (o1.getSalary()>o2.getSalary()){
                return -1;
            }
                        return 0;

    }

}
public class p11 {
    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<Employee>();
        set.add(new Employee(1, "A", 100));
        set.add(new Employee(2, "B", 200));
        set.add(new Employee(3, "C", 300));
        for (Employee e : set) {
            System.out.println(e.id + " " + e.name + " " + e.Salary);
        }

}
}