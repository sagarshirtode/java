package collection;
import java.util.*;
public class traversal {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("sagar");
        names.add("rudang");
        names.add("Appa");
        //for
        for (String str:names){
            StringBuffer st = new StringBuffer(str);
//            System.out.println(str + " " + st.reverse());
        }
        // Iterator
        Iterator<String> itr = names.iterator();
        while (itr.hasNext())
        {
            System.out.println("Iterator : " + itr.next());
        }

        ListIterator<String> lstitr = names.listIterator(names.size());
        while (lstitr.hasPrevious())
        {
            System.out.println("Iterator 1: " + lstitr.previous());
        }

        //for each
        names.forEach(e->{
            System.out.println("Iterator 2: " + e);
        });

    }
}
