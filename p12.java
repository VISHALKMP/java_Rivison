import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int Salary;
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
    }
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

  
    public  int compare(Employee o1, Employee o2) {
          
          if(o1.getName().compareTo(o2.getName()) <0){
              return +1;
          }
           return 0;

    }

}
public class p12 {
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