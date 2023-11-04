package collection;
import java.util.*;
public class startcode {
    public static void main(String[] args) {
        System.out.println("collection study");

        // Collection 1
        // 1] Type safe
        ArrayList<String> names = new ArrayList();
        names.add("sagar");
        names.add("rudang");
        names.add("rudang");
        names.add("Appa");
        names.remove("rudang");
        names.set(0,"SAGAR");
        System.out.println(names);
        names.add(0,"SAGAR 1");
        System.out.println("Size :" + names.size());
        System.out.println("IsPresent :" + names.contains("Appa"));
        System.out.println("IsEmpty :" + names.isEmpty());
        System.out.println(names);


        // 2] non Type safe
        LinkedList  linkedList = new LinkedList();
        linkedList.add("sagar");
        linkedList.add(1501);
        linkedList.add('A');
        linkedList.add("sagar");
        System.out.println(linkedList);

        Vector<String> vector = new Vector<>();
        vector.addAll(names);
        System.out.println("vector : " + vector);
        //-----------------------------------------------------

        HashSet<Double> nms = new HashSet();
        nms.add(14.13);
        nms.add(10.4);
        nms.add(10.4);
        System.out.println("HashSet : " + nms);

        TreeSet<String> test = new TreeSet();
        test.addAll(names);
        System.out.println("HashSet : " + test);
    }
}
