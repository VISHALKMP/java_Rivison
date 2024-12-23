class Demo10 {
  public static void main(String a[]) {
    // System.out.println(a.length);
    // for (int i = 0; i < a.length; i++) {
    //   System.out.println(a[i]);
    // }
    
    // int a1 = Integer.parseInt(a[0]);
    // int a2 = Integer.parseInt(a[1]);

    // System.out.println(a1 * a2);

    // int int1 = Integer.parseInt(a[0]);

    // float float1 = Float.parseFloat(a[1]);

    // boolean boolean1 = Boolean.parseBoolean(a[2]);

    // System.out.println(int1);
    // System.out.println(float1);
    // System.out.println(boolean1);

    Person obj1 = new Person(22, "jumma");
    System.out.println(obj1);
    
  }}
  // class Add{
  //   void sum(int x ,int y){
  //     System.out.println(x+y);
  //   }

  //   void sum(boolean z ,int k,double l){
    
  //         System.out.println(z+ " "+k+l);
  //   }
  //   void sum(boolean z ,int k,float l){

  //     System.out.println(z + " " + k +l);
  //   }
  // }

  class Person {
   private  int id ;
   private String name;

   Person(int id ,  String name){
    this.id =id;
    this.name =name;
   }
   public void setId(int id) {
       this.id = id;
   }

   public void setName(String name) {
       this.name = name;
   }

   public int getId() {
       return id;
   }
   public String getName() {
       return name;
   }

  }

  class Employe extends Person{
    int salary;
    void set(int salary){
      this.salary = salary;
    }
  }