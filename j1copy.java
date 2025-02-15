import java.util.ArrayList;

class Employee{
    int id;
    String name;
    String salary;

    Employee(int id,int salary,String name){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Employee{id=" + id + ", name='" + name + "', salary='" + salary + "'}";
    }

    public static void main(String[] args) {
        ArrayList<Employee>employees = new ArrayList<>();
        
    }
}