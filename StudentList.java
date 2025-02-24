import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Student {
  private   int roll ;
   private  String name;
   private int marks;

   public Student(int i, String string, int j) {
   
     }
     public void Student(int roll, String name, int marks){
       this.roll = roll;
       this.name =name;
       this.marks = marks;
      }
      public int getroll(){
       return roll;
      }
      public String getname(){
       return name;
      }
      public int marks(){
       return marks;
      }
   @Override
   public String toString() {
       return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
   }
   @Override
   public int hashCode() {
     final int prime = 31;
     int result = 1;
     result = prime * result + roll;
     result = prime * result + ((name == null) ? 0 : name.hashCode());
     result = prime * result + marks;
     return result;
   }
   @Override
   public boolean equals(Object obj) {
     if (this == obj)
       return true;
     if (obj == null)
       return false;
     if (getClass() != obj.getClass())
     return false;
     Student other = (Student) obj;
     if (roll != other.roll)
     return false;
     if (name == null) {
       if (other.name != null)
       return false;
      } else if (!name.equals(other.name))
      return false;
      if (marks != other.marks)
      return false;
      return true;
    }
  }

   public static Comparator<Student> RollNumberComaparter =  new Comparator<Student>() {
    public int compare(Student s1 , Student s2){
      return s1.getroll() - s2.getroll();
    }

    public static Comparator<Student> NameShortComparater = new Comparator<Student>() {
      public  int compare(Student s1, Student s2){
        return s1.getname().compareTo(s2.getname());
      }
    };
   }; 

   public class StudentList{
       public static void main(String[] args) {
          Student s1 = new Student(101,"chiku",98);
          Student s2 = new Student(102,"Badmosh",28);
          Student s3 = new Student(103,"Sherr",48);
          Student s4 = new Student(104,"cheetah",58);
         
          ArrayList<Student> l= new ArrayList<Student>();
              l.add(s1);
              l.add(s2);
              l.add(s3);
              l.add(s4);
           
              System.out.println(l);

       
    }

}
