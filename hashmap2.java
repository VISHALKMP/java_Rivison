import java.util.*;
class check implements Comparator<Integer>{
public int compare(Integer o1 , Integer o2) {
return -o1.comapreTo(o2);
}
public class Demo3{
public static void main(String []args){
Map <Integer,String>m = new TreeMap<Integer,String>(new check);
m.put(181,"abc");
m.put(182,"xyz");
m.put(183,"www");
m.put(184,"xxx");
  System.out.println(m);
}
}


