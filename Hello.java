import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

 public class Hello {
    // Set<Integer> t = new TreeSet<Integer>();
    // Set<String> t = new TreeSet<String>();
    Set<Double>  t = new TreeSet<Double>();


    public Hello() {
        // t.add(10);
        // t.add(20);
        // t.add(30);
        // t.add(40);
        // t.add(50);

        t.add(9485.45);
        t.add(321.12);
        t.add(234.5);
        t.add(283.25);

        System.out.println(t);
    }

    class MySorting implements Comparator<String> {
     public int compare(Double i1, Double i2) {
            // if (i1 < i2) {
            //     return -1; 
            // } else if (i1 > i2) {
            //     return 1; 
            // } else {
            //     return 0;
            // }

            return -i1.compareTo(i2);
        }

    @Override
    public int compare(String o1, String o2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compare'");
    }
    }

    public static void main(String[] args) {
        new Hello();
    }
}



