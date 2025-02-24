import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import java.util.Iterator;
import java.util.Map;

class Demo12{
    public static void main(String [] args){
        HashMap<Integer,String> m1 = new HashMap<Integer,String>();
        m1.put(1,"A");
        m1.put(2,"B");
        m1.put(3,"C");

        System.out.println(m1);

        Set s = m1.keySet();
        System.out.println(s);

        Collection c= m1.values();
        System.out.println(c);
        
        Set s2 = m1.entrySet();
        System.out.println(s2);
        
        Iterator itr = s2.iterator();
        while(itr.hasNext()){
            System.out.println();
        }
        while(itr.hasNext()){
           Map.Entry i1= (Map.Entry)itr.next();
           System.out.println(i1.getKey()+" "+i1.getValue());
        }
}
}